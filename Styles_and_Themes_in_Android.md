
# Styles and Themes in Android


Styles and themes on Android allow you to separate the details of your app design from the UI structure and behavior, similar to (css) stylesheets in web design.
A style is defined in an XML resource that is separate from the XML that specifies the layout.  The name of the XML file is arbitrary, but it must use the .xml extension.

  Where as themes is a collection of attributes that's applied to an entire app, activity, or view hierarchy—not just an individual view. When you apply a theme, every view in the app or activity applies each of the theme's attributes that it supports. Themes can also apply styles to non-view elements, such as the status bar and window background.
  
  
## Create and apply a style
To create a new style or theme, open your project's res/values/styles.xml file. For each style you want to create, follow these steps:

* Add a <style> element with a name that uniquely identifies the style.
* Add an <item> element for each style attribute you want to define.
* The name in each item specifies an attribute you would otherwise use as an XML attribute in your layout. The value in the <item> element is the value for that attribute.

For example, if you define the following style:
  
     <?xml version="1.0" encoding="utf-8"?>
    <resources>
        <style name="GreenText" parent="TextAppearance.AppCompat">
            <item name="android:textColor">#00FF00</item>
        </style>
    </resources>
  
  

## Apply a style as a theme
  You can create a theme the same way you create styles. The difference is how you apply it: instead of applying a style with the style attribute on a view, you apply a theme with the android:theme attribute on either the <application> tag or an <activity> tag in the AndroidManifest.xml file.

For example, here's how to apply the Android Support Library's material design "dark" theme to the whole app:
  
        <manifest ... >
          <application android:theme="@style/Theme.AppCompat" ... >
          </application>
      </manifest> 
  
  And here's how to apply the "light" theme to just one activity:
  
        <manifest ... >
          <application ... >
              <activity android:theme="@style/Theme.AppCompat.Light" ... >
              </activity>
          </application>
      </manifest>

  ## Applying Colors to Theme Attributes
  
  Your color resource can then be applied to some theme attributes, such as the window background and the primary text color, by adding <item> elements to your custom theme. These attributes are defined in your styles.xml file. For example, to apply the custom color to the window background, add the following two <item> elements to your custom theme, defined in MyAndroidApp/res/values/styles.xml file −
  
        <resources>
         ...
         <style name="MyCustomTheme" ...>
            <item name="android:windowBackground">@color/my_custom_color</item>
            <item name="android:colorBackgroundCacheHint">@color/my_custom_color</item>
         </style>
         ...
      </resources>
  
  ![theme](https://user-images.githubusercontent.com/102367845/193401550-4881ec95-beb2-4d7c-b7a9-130462a89314.png)
  
  Using a Custom Nine-Patch With Buttons
A nine-patch drawable is a special kind of image which can be scaled in width and height while maintaining its visual integrity. Nine-patches are the most common way to specify the appearance of Android buttons, though any drawable type can be used.

Nine Patch Button
a Sample of Nine-Patch button
Steps to create Nine-Patch Buttons
Save this bitmap as /res/drawable/my_nine_patch.9.png
Define a new style
Apply the new button style to the buttonStyle attribute of your custom theme
  
  ## Apply the theme
  
      <resources>
       ...
          <style name="MyCustomTheme" parent=...>
             ...
             <item name="android:buttonStyle">@style/MyCustomButton</item>
          </style>
       ...
    </resources>
