plugins {
    alias(libs.plugins.spring.boot)
}

dependencies {
    implementation(project(":core"))
    implementation(project(":domain"))
    
    implementation(libs.bundles.spring.web)
    
    testImplementation(libs.spring.boot.starter.test)
}

tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
    enabled = true
}

tasks.getByName<Jar>("jar") {
    enabled = false
}

