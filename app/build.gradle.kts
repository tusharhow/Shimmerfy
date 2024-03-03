plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
}

android {
    compileSdk = 34
    namespace = "com.example.composeshimmer"

    defaultConfig {
        applicationId = "com.example.composeshimmer"

        minSdk = 25
        targetSdk = 34

        versionCode = 1
        versionName = "1.0"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
}

dependencies {
    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.compose.foundation)
    implementation(libs.compose.material)
    implementation(libs.compose.ui)
    implementation(platform(libs.compose.bom))
    implementation(libs.material3)
    implementation(libs.activity.compose)
    implementation(project(":shimmerfy"))

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}