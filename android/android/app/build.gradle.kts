plugins {
    id("com.android.application")
    id("com.google.gms.google-services") // Add the Google services Gradle plugin
}

dependencies {
    // Import the Firebase BoM (Bill of Materials)
    implementation(platform("com.google.firebase:firebase-bom:33.6.0"))

    // TODO: Add the dependencies for Firebase products you want to use
    // Example:
    // implementation("com.google.firebase:firebase-auth")
    // implementation("com.google.firebase:firebase-firestore")
}

