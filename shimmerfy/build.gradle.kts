


plugins {
    id ("com.android.library")
    id ("kotlin-android")
    id ("maven-publish")
}

android {
    namespace = "com.tmahmudev.shimmerfy"
    compileSdk = 34
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    kotlinOptions {
        jvmTarget = "19"
    }
    defaultConfig {
        minSdk = 25

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = ("1.8")

    }


}

dependencies {
    implementation ("androidx.compose.ui:ui:1.6.2")
    implementation ("androidx.compose.material:material:1.6.2")
}



