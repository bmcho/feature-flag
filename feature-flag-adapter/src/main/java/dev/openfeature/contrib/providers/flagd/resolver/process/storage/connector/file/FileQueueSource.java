package dev.openfeature.contrib.providers.flagd.resolver.process.storage.connector.file;

import dev.openfeature.contrib.providers.flagd.resolver.process.storage.connector.QueuePayload;
import dev.openfeature.contrib.providers.flagd.resolver.process.storage.connector.QueuePayloadType;
import dev.openfeature.contrib.providers.flagd.resolver.process.storage.connector.QueueSource;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import lombok.extern.slf4j.Slf4j;

/**
 * File connector reads flag configurations from a given file, polls for changes and expose the
 * content through {@code Connector} contract. The implementation is kept minimal and suites
 * testing, local development needs.
 */
@Slf4j
public class FileQueueSource implements QueueSource {

    private static final String OFFER_WARN = "Unable to offer file content to queue: queue is full";

    private final String flagSourcePath;
    private final int pollInterval;
    private final BlockingQueue<QueuePayload> queue = new LinkedBlockingQueue<>(1);
    private boolean shutdown = false;

    public FileQueueSource(final String flagSourcePath, int pollInterval) {
        this.flagSourcePath = flagSourcePath;
        this.pollInterval = pollInterval;
    }

    /**
     * Initialize FileQueueSource. Reads file content, poll for changes and offer content through the
     * queue.
     */
    public void init() throws IOException {
        Thread watcherT = new Thread(() -> {
            try {
                final Path filePath = Paths.get(flagSourcePath);

                // initial read
                String flagData = new String(Files.readAllBytes(filePath), StandardCharsets.UTF_8);
                if (!queue.offer(new QueuePayload(QueuePayloadType.DATA, flagData))) {
                    log.warn(OFFER_WARN);
                }

                long lastTS = Files.getLastModifiedTime(filePath).toMillis();

                // start polling for changes
                while (!shutdown) {
                    long currentTS = Files.getLastModifiedTime(filePath).toMillis();

                    if (currentTS > lastTS) {
                        lastTS = currentTS;
                        flagData = new String(Files.readAllBytes(filePath), StandardCharsets.UTF_8);
                        if (!queue.offer(new QueuePayload(QueuePayloadType.DATA, flagData))) {
                            log.warn(OFFER_WARN);
                        }
                    }

                    Thread.sleep(pollInterval);
                }

                log.info("Shutting down file connector.");
            } catch (InterruptedException ex) {
                log.error("Interrupted while waiting for polling", ex);
                Thread.currentThread().interrupt();
            } catch (Throwable t) {
                log.error("Error from file connector. File connector will exit", t);
                if (!queue.offer(new QueuePayload(QueuePayloadType.ERROR, t.toString(), null))) {
                    log.warn(OFFER_WARN);
                }
            }
        });

        watcherT.setDaemon(true);
        watcherT.start();
        log.info(String.format("Using feature flag configurations from file %s", flagSourcePath));
    }

    /** Expose the queue to fulfil the {@code Connector} contract. */
    public BlockingQueue<QueuePayload> getStreamQueue() {
        return queue;
    }

    /** Shutdown file connector. */
    public void shutdown() throws InterruptedException {
        shutdown = true;
    }
}
