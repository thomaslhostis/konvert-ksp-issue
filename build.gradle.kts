plugins {
    kotlin("jvm") version "2.1.20"
    id("com.google.devtools.ksp").version("2.1.21-2.0.1")
}

group = "com.thomaslhostis"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.mcarle:konvert-api:4.1.0")
    ksp("io.mcarle:konvert:4.1.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(22)
}
