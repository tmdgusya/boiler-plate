plugins {
    id("org.jetbrains.intellij") version "1.4.0"
    kotlin("jvm") version "1.6.10"
    java
}

group = "com.woowa.bss"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2021.3.2")
}
tasks {
    patchPluginXml {
        changeNotes.set("""
            Add change notes here.<br>
            <em>most HTML tags may be used</em>        """.trimIndent())
    }
}
tasks.getByName<Test>("test") {
    useJUnitPlatform()
}