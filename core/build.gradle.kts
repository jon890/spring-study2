plugins {
    alias(libs.plugins.spring.boot)
}

dependencies {
    implementation(project(":domain"))
    
    implementation(libs.bundles.spring.data)
    
    testImplementation(libs.spring.boot.starter.test)
}

tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
    enabled = false
}

tasks.getByName<Jar>("jar") {
    enabled = true
    archiveClassifier.set("")
}

