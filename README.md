# ARTranslation
AR Translation consists of two parts: the native Android app and the Unity module. The Android app is developed here.

The Unity module is integrated with Android Studio by importing the module as a library.

File → Build Settings
Select your scene
In platform section select Android
Change Texture to ETC2
Change Build System to Gradle
Click on player setting button → In Inspector tab → other setting add your package name under Bundle Identifier (see image below)
Mark Export and export

Grab the .aar file stored in your project like so:
PROJECT_FOLDER\build\outputs\aar

rename it AR-Trans-debug.aar and drop it into your Android Studio project.We handled the library imports for you, so you're done.

The module player is launched in the Android context like so:
Intent intent = new Intent(getApplicationContext(), UnityPlayer.class);
