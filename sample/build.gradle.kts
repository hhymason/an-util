import plugins.Libraries

plugins {
    id("sample")
}

android {
    namespace = "com.mason.util.sample"
}

dependencies {
    // main
    implementation(project(":library"))
    implementation(Libraries.Androidx.STARTUP)
    implementation(Libraries.EASY_PERMISSIONS)
}
