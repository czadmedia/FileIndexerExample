plugins {
    application
    kotlin("jvm") version "2.2.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    dependencies {
        implementation("com.github.czadmedia:FileIndexer:v0.1.4")
    }

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("org.example.Main")
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
