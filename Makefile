#!/bin/bash

.PHONY: run lint build test graphqlSchema image

run:
	./gradlew clean :feature-flag-app:bootRun

build:
	./gradlew build -x test

tester:
	./gradlew :feature-flag-app:tester:bootRun

docker:
	docker-compose up -d
image:
	./gradlew clean :feature-flag-app:jibDockerBuild