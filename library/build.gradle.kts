import plugins.Libraries

plugins {
    id("lib")
    id("kotlin-parcelize")
}

android {
    namespace = "com.mason.util"

    defaultConfig {
        resourcePrefix = "util_"
    }
}

dependencies {
    // main
    coreLibraryDesugaring(Libraries.DESUGAR)
    implementation(Libraries.Androidx.STARTUP)
    implementation(Libraries.Androidx.APPCOMPAT)
    implementation(Libraries.Google.ZXING)
}
