// Top-level build file. Declares plugin versions used by sub-modules.
plugins {
    id("com.android.application") version "8.5.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
    // Google Services plugin reads app/google-services.json at build time
    id("com.google.gms.google-services") version "4.4.2" apply false
}
