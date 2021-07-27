plugins {
    java
}

group = "io.github.nickacpt.legacycraft"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<Jar> {
    manifest {
        attributes["Premain-Class"] = "io.github.nickacpt.legacycraft.agent.LegacyCraftAgent"
        attributes["Can-Redefine-Classes"] = true
        attributes["Can-Retransform-Classes"] = true
    }
}