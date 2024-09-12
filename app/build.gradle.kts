plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.myrecipebook"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myrecipebook"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {

        viewBinding = true
    }
}

dependencies {
    implementation ("com.google.android.material:material:1.0.0")
    implementation("androidx.cardview:cardview:1.0.0")
    val nav_version = ("2.3.5")
    val lifecycleVersion = "2.4.0"
    val room_version = ("2.3.0")

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //retrofit

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.3.0")


    // nvigation component
    implementation ("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation ("androidx.navigation:navigation-ui-ktx:$nav_version")

    //retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    //viewmodel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.1.0")

    val lifecycle_version = "2.6.0-alpha01" // ViewModel


    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:\$lifecycle_version") // ViewModel utilities for Compose


    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:\$lifecycle_version") // LiveData


    implementation("androidx.lifecycle:lifecycle-livedata-ktx:\$lifecycle_version") // LiveData utilities for Compose

    implementation ("com.github.bumptech.glide:glide:4.13.2")

    implementation ("androidx.lifecycle:lifecycle-livedata:2.4.0")



}