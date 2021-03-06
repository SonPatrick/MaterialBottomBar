plugins {
    `kotlin-dsl`
}

repositories {
    google()
    jcenter()
}

dependencies {
    implementation("com.android.tools.build:gradle:3.3.1" )
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:0.9.17" )
    implementation("org.jetbrains.dokka:dokka-android-gradle-plugin:0.9.17" )
    implementation("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4" )
}