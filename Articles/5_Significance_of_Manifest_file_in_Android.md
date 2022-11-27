## Importance of Manifest File in Android
Each android application you build will include a file call <b>AndroidManifest.xml</b> which is placed in the <b>root of the project heirarchy</b>.
<br>
It's important as it lets you define the <b><i>structure and the metadata</i></b> of your android application and its components.
<br><br>
![android-studio-manifest](https://user-images.githubusercontent.com/71769587/195367949-7eb999c3-bd7a-4b3e-b593-aa5fad55a5e7.jpg)
<br>
The Android Application Manifest file includes nodes for each of the following components:
- Activities
- Services
- Content providers
- Broadcast Receivers
that make up your application and uses <b>Intent Filters and Permissions</b> to determine how they interact with each other and other applications.
<br>
It also offers you attributes that you can use to specify application metadata like icon and theme among other things
<br><br>
The android application manifest file is made up of a root manifest tag with a package attribute set to the project's package. It normally includes an xmlns:android attribute that sypplies several system attributes used within the android application manifest file.

Android Application Manifest File:
```
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
  xmlns:tools="http://schemas.android.com/tools"
  package="com.techninja.learnandroid">
  
  <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
  
  <application 
    android:allowBackup="true"
    android:icon="@mipmap/ic_launcher"
    android:label="@string/app_name"
    android:roundIcon=@mipmap/ic_launcher_round"
    android:supportsRtl="true"
    android:theme="@style/AppTheme"
    tools:replace="android:icon">
   <activity
     android:name=".MainActivity">
     <intent-filter>
      <action android:name="android.intent.action,MAIN"/>
      <category android:name="android.intent.category.LAUNCHER"/>
     </intent-filter>
    </activity>
   </application>
  
</manifest>
```

It performs some other tasks also:

- It is responsible to protect the application to access any protected parts by providing the permissions.
- It also declares the android api that the application is going to use.
- It lists the instrumentation classes. The instrumentation classes provides profiling and other informations. These informations are removed just before the application is published etc.

As stated earlier, the manifest tag includes nodes that define the applicaiton components, security settings and even test classes that make up your cool app. Let us now get personal with these manifest node tags with xml examples.

# Android Application Manifest Node Tags

## Application: 
A manifest can contain only one application node. This uses attributes to specify the metadata for your android application (title,icon, and theme). Besides that, it acts as a container that includes the **Activity, Service, Content Provider and Broadcast Receiver tags** for specifying the application components:
- **Activity**: For every activity displayed by your android application, an activity tag is required. You set it using android:name attribute to specify the class name. It must include the main Launch Activity and any other screen or dialog that can be displayed. If you try to start an Activity that is not defined, you will get a runtime exception. Each Activity node supports intent-filter child tags which specify which Intents launch the activity.
- **Service**: Just like the activity tag, you must create a new service for each Service class used inside your application. Service tags also support intent-filter child tags to allow late runtime binding.
- **Provider**: Provider tags are used for each of your application's Content Providers. Content Providers are used to manage database access and sharing within and between applications.
- **Receiver** : You can register a Broadcast Receiver by adding a receiver tag without having to launch your applicatoin first. Broadcast Receivers are most like global event listeners - once registered, they will execute whenever a matching Intent is broadcast by an application.

## Uses-permission:
This is the part of the security model. It declares permission to have determined that your application needs to operate properly. The permission you include will always be presented to the user to either grant or deny during installation. Many native android services require permissions for example those that have a cost or security implication. Examples: Location services, SMS etc...

## Permission:
You need to define a permission in the android application manifest file before restricting access to any application component. Use the permission tag to create the permission definitions. The application components can then require them by adding the android:permission attribute.
Other apps will then need to include a uses-permission tag in their manifest file and have it granted before they can use these protected components.
<br>
Within the permission tag you can specify the level of access the permission will permit (normal,dangerous,signature,signatureOrSystem), a label, and an external resource containing the description that explains the risks of granting this permission.

## Instrumentation:
Instrumentation classes provide a framework for running tests on your Activities and Services at run time. They simply provide hooks to monitor your application and its interaction with the system resources. You must create a new node for each of the test classes you have created in your application.
