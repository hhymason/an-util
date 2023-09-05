// Top-level build file where you can add configuration options common to all sub-projects/modules.
import plugins.MavenUrls
import plugins.Versions

plugins {
    id("org.jetbrains.kotlinx.kover")
    id("org.sonarqube")
}

buildscript {
    // Don't declare classpath dependencies here.
    // Instead, declare them as implementation dependency in `/buildSrc/build.gradle.kts`.
    // It has the same outcome on the configuration of the project with the benefit that
    // we can use type-safe kotlin scripts defined in `buildSrc` sources.
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(MavenUrls.GOOGLE)
        maven(MavenUrls.ALIBABA)
        maven(MavenUrls.GRADLE)
        maven(MavenUrls.JITPACK)
    }
}

subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")

    configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
        android.set(true)
    }

    configurations.all {
        resolutionStrategy.eachDependency {
            // Force all Kotlin stdlib artifacts to use the same version.
            if (requested.group == "org.jetbrains.kotlin" && requested.name.startsWith("kotlin-stdlib")) {
                useVersion(Versions.Kotlin.STDLIB)
            }
        }
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = "11"
            kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.RequiresOptIn"
        }
    }

}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
