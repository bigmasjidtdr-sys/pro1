Noorul Islam Firebase Demo (Android / Kotlin)
==============================================

Contents
--------
- Firebase Auth (email/password) via LoginActivity.kt
- FCM push notifications via MyFirebaseMessagingService.kt
- google-services.json already placed in /app (package_name: Noorul.Islam)

How to open
------------
1. Open Android Studio > Open > select the NoorulIslamFirebaseDemo folder.
2. Let Gradle sync (it will download the AGP/Kotlin/Firebase plugin versions pinned in build.gradle.kts).
3. In Firebase Console, enable Authentication > Sign-in method > Email/Password
   (currently no providers are enabled by default on a fresh project).
4. Run on a device/emulator with Google Play services.

Testing push notifications
---------------------------
1. Run the app, sign in or register, land on MainActivity.
2. Copy the FCM token shown on screen.
3. Firebase Console > Engage > Messaging > New campaign > Send test message > paste token.

Notes
-----
- applicationId/namespace is "Noorul.Islam" to match google-services.json exactly.
  This is unconventional (Android package names are normally all-lowercase, e.g. com.example.app).
  It will build and run fine, but if you re-register the app in Firebase later with a
  lowercase package name, update applicationId/namespace in app/build.gradle.kts,
  the java/ folder path, and the "package" line in each .kt file to match, then
  re-download google-services.json.
- minSdk 24 (Android 7.0+).

No Android Studio? Build the APK via GitHub (free)
----------------------------------------------------
1. Create a new repo at https://github.com/new (public or private, doesn't matter).
2. Upload all files/folders from this project into that repo
   (web UI: "Add file" > "Upload files", drag the whole extracted folder contents in,
   including the hidden .github folder - or use `git push` if you have git installed).
3. Go to the repo's "Actions" tab. The "Build Debug APK" workflow runs automatically
   on push (or click "Run workflow" to trigger it manually).
4. Wait for the green checkmark (a couple of minutes), open the completed run,
   and download the "app-debug-apk" artifact from the "Artifacts" section at the bottom.
5. Unzip it to get app-debug.apk.
6. Transfer app-debug.apk to your phone (email, Google Drive, USB, etc.), open it,
   allow "install from unknown sources" if prompted, and install.

The debug APK is auto-signed with a debug keystore by Gradle, so it installs directly -
no extra signing step needed for testing on your own device.
