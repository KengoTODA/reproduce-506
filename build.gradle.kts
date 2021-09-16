plugins {
    `antlr`
    `java-library`
    id("com.github.spotbugs") version "4.7.5"
}

repositories {
    mavenCentral()
}

dependencies {
    antlr("org.antlr:antlr4:4.5")
}
