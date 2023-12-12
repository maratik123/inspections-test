plugins {
    id("java")
    kotlin("jvm") version "1.9.21"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(20)
}

application {
    mainClass.set("org.example.Main")
}
