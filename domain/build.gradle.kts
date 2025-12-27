dependencies {
    // Domain 모듈은 순수 Java 모듈로, 외부 의존성을 최소화합니다.
}

tasks.getByName<Jar>("jar") {
    enabled = true
    archiveClassifier.set("")
}

