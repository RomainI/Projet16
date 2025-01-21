// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    dependencies {
        classpath("org.bouncycastle:bcutil-jdk18on:1.78.1")
    }
}
plugins {
    id("com.android.application") version "8.6.0" apply false
    id("org.jetbrains.kotlin.android") version "2.0.21" apply false
    id("com.google.dagger.hilt.android") version "2.42" apply false
    id("com.google.devtools.ksp") version "2.0.21-1.0.27" apply false
    id("org.sonarqube") version "6.0.1.5171" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
    id("com.google.firebase.appdistribution") version "5.1.0" apply false


}