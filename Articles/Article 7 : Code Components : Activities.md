<h1 align="center">Article 7 : Code Components : Activities</h1>

An activity provides the window in which the app draws its UI. This window typically fills the screen, but may be smaller than the screen and float on top of other windows. Generally, one activity implements one screen in an app.

Activity class is one of the very important parts of the Android Component. **Any app, don’t matter how small it is (in terms of code and scalability), has at least one Activity class**.So it can be said that An activity is the **entry point for interacting with the user**. Every activity contains the layout, which has a user interface to interact with the user. As we know that every activity contains a layout associated with it, so it can be said that the activity class is the gateway, through which a user can interact programmatically with the UI. Layout for a particular activity is set with the help of setContentView(). setContentView() is a function that takes View as a parameter. The view parameter basically contains the layout file for that activity. The code has been given in both Java and Kotlin Programming Language for Android.

The Following Code Indicates that activity_main is the Layout File of MainActivity :

<pre>

import androidx.appcompat.app.AppCompatActivity 
import android.os.Bundle 
  
class MainActivity : AppCompatActivity() { 
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_main) 
    } 
}
</pre>

While activities are often presented to the user as the full-screen window, Multiwindow mode, or Picture in Picture mode, here are two methods almost all subclasses of Activity will implement:
<br>
<br>
<h4>1. onCreate() </h4>
<h4>2. onPause() </h4>

<h2>1. onCreate() </h2>

<h4>The syntax for Kotlin:</h4>

<pre>override fun onCreate(savedInstanceState: Bundle?)</pre>

<h4>The syntax for Java:</h4>

<pre>protected void onCreate(Bundle savedInstanceState)</pre>

• ***onCreate(Bundle)*** method is the place, where the user initializes the activity. This method is called when the activity is starting. This is the method that is used to initialize most of the things in the android app. onCreate() method takes savedInstanceState as the parameter, which the object of type Bundle, i.e Bundle Object which contains the previously saved data of the activity. If the activity is newly created then the bundle won’t be saving any data of the activity and would contain the null value.
<br>
• ***onCreate()*** method calls the setContentView() method to set the view corresponding to the activity. By default in any android application, setContentView point to activity_main.xml file, which is the layout file corresponding to MainActivity. The onCreate method uses the findViewById() method so that the user can interact programmatically with the widgets in android and then customize them according to need.

<br>
<b>Bundle</b> If the activity is being re-initialized or restarted after previously being closed, then this Bundle contains the data it most recently supplied in onSaveInstanceState(Bundle). onSaveInstanceState() method is the method that is called to save the data just before our activity is killed.

<h2>2. onPause() Method</h2>

<h4>The syntax for Kotlin:</h4>

<pre>override fun onPause() {
    super.onPause()
}</pre>

<h4>The syntax for Java:</h4>

<pre>protected void onPause() {
    super.onPause();
}</pre>

This method is called part of the Activity Lifecycle when the user no longer actively interacts with the activity, but it is still visible on the screen. Let’s suppose the user is running two apps simultaneously on a mobile phone, i.e when activity B is launched in front of activity A, activity A will go in the onPause() state, and activity B would go in the onStart() state of the activity lifecycle. One important point to be remembered is that for any activity to be accessed by a system, i.e. android here, that activity must be declared in a Manifest File. The Manifest File is an XML file included in the Application and is by default known as AndroidManifest.xml.

<h4>Declaring Activity in Manifest File</h4>
<h5>Open the app folder, and then open the subfolder manifest, and then open the AndroidManifest.xml file.</h5>

<img src="https://user-images.githubusercontent.com/52368582/195005165-244c6da7-3bbd-4501-9cfb-faeebfa199b3.png"/>

<h5>Let’s suppose the reader wants to have one more activity, apart from the MainActivity which is included by default in the project. Before adding one more activity and not doing any changes,</h5>
<h4>Let’s see what the AndroidManifest.xml File looks like</h4>

<img src="https://user-images.githubusercontent.com/52368582/195005898-123ac5dc-e95e-463c-8746-5800a19ffedb.png"/>


Now let’s add another activity named SecondActivity, and see how to declare it in the manifest file. One must write the Declaration Code within the application tag, otherwise, the declaration will give the error, and SecondActitvity will not be detected by the System. The Declaration Code is given below.


<img src="https://user-images.githubusercontent.com/52368582/195006058-370d0e08-c5c0-4308-89c0-81e6c5b82d3b.png"/>


So it can conclude that an application can have one or more activities without any restrictions. Every activity that the android app uses must be declared in the AndroidManifest.xml file. and the main activity for the app must be declared in the manifest with a <intent-filter> that includes the MAIN action and LAUNCHER. Any activity whether it is MainActivity or any other activity must be declared within the <application> of the AndroidManifest file. If the user forgets to declare any of the activity, then android will not be able to detect that activity in the app. If either the MAIN action or LAUNCHER category is not declared for the main activity, then the app icon will not appear in the Home screen’s list of apps.


  <br>
  <h2>Activity Lifecycle in Android</h2>
  
  In Android, an activity is referred to as one screen in an application. It is very similar to a single window of any desktop application. An Android app consists of   one or more screens or activities. 
  <br>
  Each activity goes through various stages or a lifecycle and is managed by activity stacks. So when a new activity starts, the previous one always remains below it.   There are four stages of an activity.
  <br>

 • If an activity is in the foreground of the screen i.e at the top of the stack, then it is said to be active or running. This is usually the activity that the user      is currently interacting with.
  
 • If an activity has lost focus and a non-full-sized or transparent activity has focused on top of your activity. In such a case either another activity has a higher    position in multi-window mode or the activity itself is not focusable in the current window mode. Such activity is completely alive.
  
 • If an activity is completely hidden by another activity, it is stopped or hidden. It still retains all the information, and as its window is hidden thus it will        often be killed by the system when memory is needed elsewhere.
  
 • The system can destroy the activity from memory by either asking it to finish or simply killing its process. When it is displayed again to the user, it must be        completely restarted and restored to its previous state.
  
  
  For each stage, android provides us with a set of 7 methods that have their own significance for each stage in the life cycle. The image shows a path of migration whenever an app switches from one state to another.
  
  <img src="https://user-images.githubusercontent.com/52368582/195008436-15d08fde-3ee8-4045-ba54-e33613497ccd.jpg"/>

  <br>
  <h3>Detailed introduction on each of the method is stated as follows: </h3>
  
  <h3>1. onCreate()</h3>
 It is called when the activity is first created. This is where all the static work is done like creating views, binding data to lists, etc. This method also provides a Bundle containing its previous frozen state, if there was one. 
  <br>
  <img src="https://user-images.githubusercontent.com/52368582/195009305-16604906-b3b5-4fef-a0f9-b2a801997bda.png"/>
    <br>
  <h3>2. onStart() </h3>
It is invoked when the activity is visible to the user. It is followed by onResume() if the activity is invoked from the background. It is also invoked after onCreate() when the activity is first started.
  <br>
  <img src="https://user-images.githubusercontent.com/52368582/195009524-06b75422-0eb8-48ec-ab26-c0ba31a5559f.png"/>

  <h3>3. onRestart() </h3> 
  It is invoked after the activity has been stopped and prior to its starting stage and thus is always followed by onStart() when any activity is revived from background to on-screen.  
  
   <img src="https://user-images.githubusercontent.com/52368582/195010828-a17649a1-8e20-42a9-bd6f-43d1bf845fc2.png"/>

   <br>
<h3>4. onResume()</h3> 
  It is invoked when the activity starts interacting with the user. At this point, the activity is at the top of the activity stack, with a user interacting with it. Always followed by onPause() when the activity goes into the background or is closed by the user. 
  
   <img src="https://user-images.githubusercontent.com/52368582/195011129-88a526b6-f1e7-4256-bc7b-131f68cd0a76.png"/>
  
   <br>
  <h3>5. onPause() </h3> 
  It is invoked when an activity is going into the background but has not yet been killed. It is a counterpart to onResume(). When an activity is launched in front of another activity, this callback will be invoked on the top activity (currently on screen). The activity, under the active activity, will not be created until the active activity’s onPause() returns, so it is recommended that heavy processing should not be done in this part. 
  
   <img src="https://user-images.githubusercontent.com/52368582/195011327-687e57e0-cf12-4895-bff7-f68e8eaac613.png"/>

   <br>
  <h3>6. onStop()</h3> 
  It is invoked when the activity is not visible to the user. It is followed by onRestart() when the activity is revoked from the background, followed by onDestroy() when the activity is closed or finished, and nothing when the activity remains on the background only. Note that this method may never be called, in low memory situations where the system does not have enough memory to keep the activity’s process running after its onPause() method is called. 
  
   <img src="https://user-images.githubusercontent.com/52368582/195011443-086da936-5431-42fe-a988-b85ccf87c999.png"/>

   <br>
    <h3>7. onDestroy() </h3> 
  The final call received before the activity is destroyed. This can happen either because the activity is finishing (when finish() is invoked) or because the system is temporarily destroying this instance of the activity to save space. To distinguish between these scenarios, check it with isFinishing() method. 
  
   <img src="https://user-images.githubusercontent.com/52368582/195011543-5343d0a2-765c-4f2a-a4d4-9cb2779bc8fe.png"/>
  
   <br>
  
  <h3>Demo Android Code to Demonstrate Activity Lifecycle in Android</h3> 
  
  <img src="https://user-images.githubusercontent.com/52368582/195011819-cf3f33ca-6849-4167-ad99-293e11de8613.png"/>
