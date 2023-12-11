import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.2.0"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.20"
    kotlin("plugin.spring") version "1.9.20"
}

group = "com"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-rest")
    implementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(module = "junit")
        exclude(module = "spring-test")
    }
    implementation("org.springframework.restdocs:spring-restdocs-mockmvc")
    implementation("mysql:mysql-connector-java") // MySQL
    implementation("org.springframework.boot:spring-boot-starter-validation")

    testImplementation("io.kotest:kotest-core:4.6.0") // Kotest core 모듈
    testImplementation("io.kotest:kotest-assertions-core:4.6.0") // Kotest assertions 모듈
    testImplementation("io.kotest:kotest-runner-junit5:4.6.0") // Kotest JUnit5 지원 모듈
    testImplementation("io.kotest:kotest-extensions-spring:4.6.0") // Kotest Spring 지원 모듈
    // 추가로 필요한 Kotest 모듈을 여기에 추가할 수 있습니다.
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
