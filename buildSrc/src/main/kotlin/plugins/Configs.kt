package plugins

object Apps {
    /** 主版本号. */
    const val MAJOR = 1

    /** 子版本号. */
    const val MINOR = 0

    /** 修正版本号. */
    const val PATCH = 0

    const val APPLICATION_ID = "com.mason.util.sample"
    const val TEST_APPLICATION_ID = "com.mason.util.sample.test"

    /** SDK 编译版本 */
    const val COMPILE_SDK = 32

    /** 最小 SDK 版本. */
    const val MIN_SDK = 19

    /** 目标 SDK 版本 */
    const val TARGET_SDK = 32
}

object MavenUrls {
    const val ALIBABA = "https://maven.aliyun.com/repository/public/"
    const val GOOGLE = "https://maven.aliyun.com/repository/google/"
    const val GRADLE = "https://maven.aliyun.com/repository/gradle-plugin/"
    const val JITPACK = "https://jitpack.io"
}
