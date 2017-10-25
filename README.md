# ARTranslation
AR Translation consists of two parts: the native Android app and the Unity module. The Android app is developed here.

The Unity module is integrated with Android Studio by importing the module as a library.

File → Build Settings<br>
Select your scene<br>
In platform section select Android<br>
Change Texture to ETC2<br>
Change Build System to Gradle<br>
Click on player setting button → In Inspector tab → other setting add your package name under Bundle<br> Identifier (see image below)<br>
Mark Export and export<br>

Grab the .aar file stored in your project like so:<br>

PROJECT_FOLDER\build\outputs\aar<br>

rename it AR-Trans-debug.aar and drop it into your Android Studio project.We handled the library imports for you, so you're done.<br>

The module player is launched in the Android context like so:<br>
Intent intent = new Intent(getApplicationContext(), UnityPlayer.class);
