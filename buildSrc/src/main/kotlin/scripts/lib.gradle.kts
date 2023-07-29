import plugins.Apps
import plugins.Artifacts
import plugins.LIB_VERSION_NAME
import plugins.kotlinDependencies

plugins {
    id("com.android.library")
    kotlin("android")
    id("maven-publish")
}
android {
    compileSdk = Apps.COMPILE_SDK

    defaultConfig {
        minSdk = Apps.MIN_SDK
        targetSdk = Apps.TARGET_SDK
        consumerProguardFiles("consumer-rules.pro")
        multiDexEnabled = true // 解决 API 21 以下系统 android test 方法数超出 64K 限制问题

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunnerArguments += mapOf(
            "clearPackageData" to "true",
            "disableAnalytics" to "true",
        )
    }

    publishing {
        multipleVariants {
            withSourcesJar()
            withJavadocJar()
            allVariants()
        }
    }

    sourceSets {
        getByName("main") {
            // 主要代码目录
            java.srcDir("src/main/kotlin")
        }
    }

    compileOptions {
        encoding = "UTF-8"
        sourceCompatibility(JavaVersion.VERSION_11)
        targetCompatibility(JavaVersion.VERSION_11)
    }

    libraryVariants.all {
        outputs.map { it as com.android.build.gradle.internal.api.BaseVariantOutputImpl }
            .forEach { output ->
                output.outputFileName =
                    "${Artifacts.ARTIFACT_ID}-${buildType.name}-${LIB_VERSION_NAME}.aar"
            }
    }

}

dependencies {
    // main
    // kotlin
    kotlinDependencies()
}

val runTasks: MutableList<String> = gradle.startParameter.taskNames

tasks.register<Jar>("androidSourcesJar") {
    from(android.sourceSets["main"].java.srcDirs)
    archiveClassifier.set("sources")
}
