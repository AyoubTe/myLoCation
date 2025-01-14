plugins {
    id("com.android.application")
}

android {
    namespace = "com.sami.googlemapstp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sami.googlemapstp"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation ("androidx.appcompat:appcompat:1.5.1")
    implementation ("com.google.android.gms:play-services-maps:18.1.0")

    implementation ("com.google.android.material:material:1.2.0-alpha02")
    implementation("com.google.android.material:material:1.12.0")

    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
}