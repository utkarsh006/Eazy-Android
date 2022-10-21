# About Android Project Structure
Creating an Android project in Android Studio is as simple as clicking a few buttons. Along the way you will be asked to choose the minimum Android SDK that will be supported by your application. Of course, you are still able to change this in the course of developing your application.

Once created, the project files contain various folders and files about project settings as well as your Android Application module.

![project_structure](https://miro.medium.com/max/600/1*7HPcMIu90tbDkDZNz3QRzw.png "Top-level view of Android project in Android Studio")

### Let’s go through the project-wide files briefly.

* .idea directory contains Intellij IDEA settings.
* .gitignore file specifies which files/directories to be ignored by Git
* gradle directory contains gradle-wrapper files.
* build.gradle allows you to customise properties for build system such as setting location of your keystore used for signing the app-release.apk.
* settings.gradle tells sub-projects for gradle to build.

### Now, let’s take a closer look inside your app folder.

![app_level_project_structure](https://miro.medium.com/max/600/1*ASUkWTnLsvjfc3Tw3BmzLw.png "App Level Project Structure")

* AndroidManifest.xml is a compulsory file to have in every Android application. It controls the nature of your application. For example, it allows you to set the name and icon of your application. It also describes activities and other components of your application, as well as permissions and libraries required to run your application.
* java.<package> contains the source codes for your application, including tests.
* res/drawable contains bitmap files (eg. png, jpeg), 9-Patch images (stretchable and repeatable images), and drawable shapes (xml).
* res/layout contains XML screen layout files that can be linked to Activities or other components of your application. The layout files are referenced by its filename, while the each component inside the layout can be referenced by their respective ids.
* res/menu contains XML files for menu application.
* res/mipmap contains your app-launcher icons (icon displayed on the home screen) for various screen resolutions.
* res/values contains XML value files for specifying colors, dimensions, strings, styles, etc. Besides for neat organization, classifying values under this directory is useful for reusability if many components of the application need to use the same value.
* build.gradle (Module: app) allows us to customise properties for build system, specific to the module app. It will override default build settings used by the manifest. You will usually add dependency libraries specific to your application here as well.

Knowing the structure of Android project is one of the great ways to start learning about building Android application. It gives you a quick overview about the files and directories important in the course of building Android applications. In addition, it would also speed up your learning process as you would now be more familiar with the structure and are able to navigate around sample Android projects easier while learning.
