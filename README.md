# 🚩 Feature-Flag 시스템

**Feature-Flag 시스템**은 헥사고날 아키텍처(Hexagonal Architecture)를 기반으로 설계된 **실시간 기능 토글 관리 솔루션**입니다.  
운영 중인 서비스에서 **안전한 기능 롤아웃**을 지원합니다.

---

## 🏛️ 아키텍처 개요 (Hexagonal Architecture)

헥사고날 아키텍처(Ports & Adapters)는 시스템의 **핵심 도메인 로직과 외부 세계(웹, DB, 메시징 등)를 분리**하여  
**확장성, 테스트 용이성, 유지보수성**을 극대화합니다.

## 📂 프로젝트 구조
```
feature-flag/
├── feature-flag-adapter/ # 외부 시스템 연동 모듈 (예: flagd, 모니터링)
├── feature-flag-app/ # Application 레이어 (서비스/유스케이스)
├── feature-flag-usecase/ # 핵심 도메인/비즈니스 로직
├── flagd/ # 기능 토글 플래그 설정
├── grafana/ # 모니터링 대시보드 템플릿
├── prometheus/ # 메트릭 수집 설정
├── docker-compose.yaml # 전체 서비스 실행 환경
├── build.gradle # 프로젝트 빌드 설정
└── Makefile # 자동화 명령어 제공
```


---

## 🛠️ 기술 스택

| 범주        | 기술 스택                        |
|-------------|----------------------------------|
| 언어        | Java 17                         |
| 프레임워크  | Spring Boot 3.4.5                 |
| 기능 토글   | OpenFeature               |
| 모니터링    | Prometheus, Grafana              |
| 인프라      | Docker Compose                   |

---

## ⚡ 주요 기능

- 실시간 기능 활성화/비활성화
- 다중 환경 지원 (개발 / 스테이징 / 운영)
- 사용자 세그먼트 기반 기능 제어
- 시스템 성능 및 토글 현황 모니터링

---

## 🚀 빠른 시작

```bash
# 1. 저장소 복제
git clone https://github.com/bmcho/feature-flag.git

# 2. 빌드 및 실행 (Makefile 사용)
make build
docker-compose up -d
```

---

## 🔧 주요 서비스 구성
|서비스	|포트|	설명|
|-------------|-------------|-------------|
|Application	|8080|	기능 토글 관리 API 서버|
|flagd	|8013||	기능 토글 설정 서버|
|Prometheus	|9090	|메트릭 수집기|
|Grafana	|3000	|모니터링 대시보드|

---

## ⚙️ 기능 토글 설정 예시
# flagd/example_flags.json
```
"flags":
  "new_flag_key":
    state: ENABLED
    "variants": {
      "on": "true"
      "off": "false"
    }
    "defaultVariant": "on"
```

---

## 🛠️ 주요 Make 명령어
```
make build     # 프로젝트 빌드
make test      # 단위 테스트 실행
make run       # 로컬 환경 실행
make monitor   # 모니터링 시스템 실행
```

---

```
⚠️ 운영 시 참고사항
🔐 보안: 기능 토글 API에 인증/인가 계층 추가 권장
📝 감사 로그: 기능 변경 이력 추적 시스템 연동
🌐 확장성: 대규모 환경에서는 flagd 클러스터 구성 고려
```
