package plugins

object Versions {
    object Kotlin {
        const val STDLIB = "1.6.21"
        const val COROUTINE = "1.6.4"
        const val SERIALIZATION = "1.3.3"
    }

    object Androidx {
        const val APPCOMPAT = "1.5.1"
        const val MULTIDEX = "2.0.1"
        const val NAVIGATION = "2.5.2"
        const val CONSTRAINT_LAYOUT = "2.1.4"
        const val STARTUP = "1.1.1"
    }

    object Google {
        const val MATERIAL = "1.6.1"
        const val ZXING = "3.3.3" // 3.4 以后版本只支持 API 24 以上
    }

    object Square {
        const val LEAK_CANARY = "2.9.1"
    }

    const val DESUGAR = "1.2.2"
    const val THREE_TEN_ABP = "1.3.1"
    const val EASY_PERMISSIONS = "3.0.0"
}

object Libraries {
    object Kotlin {
        const val STDLIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.Kotlin.STDLIB}"
        const val COROUTINE =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Kotlin.COROUTINE}"
        const val SERIALIZATION =
            "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.Kotlin.SERIALIZATION}"
        const val JUNIT = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.Kotlin.STDLIB}"
        const val COROUTINE_TEST =
            "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.Kotlin.COROUTINE}"
    }

    object Androidx {
        const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.Androidx.APPCOMPAT}"
        const val MULTIDEX = "androidx.multidex:multidex:${Versions.Androidx.MULTIDEX}"
        const val CONSTRAINT_LAYOUT =
            "androidx.constraintlayout:constraintlayout:${Versions.Androidx.CONSTRAINT_LAYOUT}"
        const val NAVIGATION_UI =
            "androidx.navigation:navigation-ui-ktx:${Versions.Androidx.NAVIGATION}"
        const val NAVIGATION_FRAGMENT =
            "androidx.navigation:navigation-fragment-ktx:${Versions.Androidx.NAVIGATION}"
        const val STARTUP =
            "androidx.startup:startup-runtime:${Versions.Androidx.STARTUP}"

    }

    object Google {
        const val MATERIAL = "com.google.android.material:material:${Versions.Google.MATERIAL}"
        const val ZXING = "com.google.zxing:core:${Versions.Google.ZXING}"
    }

    object Square {
        const val LEAK_CANARY =
            "com.squareup.leakcanary:leakcanary-android:${Versions.Square.LEAK_CANARY}"
    }

    const val DESUGAR = "com.android.tools:desugar_jdk_libs:${Versions.DESUGAR}"
    const val EASY_PERMISSIONS = "pub.devrel:easypermissions:${Versions.EASY_PERMISSIONS}"
}
