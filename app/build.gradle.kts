plugins {
    id("com.android.application")
}

android {
    namespace = "uz.kimyo.teplo"
    compileSdk = 34

    defaultConfig {
        applicationId = "uz.kimyo.teplo"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
