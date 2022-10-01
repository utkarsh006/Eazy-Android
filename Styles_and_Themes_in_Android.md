
# Styles and Themes in Android


Styles and themes on Android allow you to separate the details of your app design from the UI structure and behavior, similar to (css) stylesheets in web design.
A style is defined in an XML resource that is separate from the XML that specifies the layout.  The name of the XML file is arbitrary, but it must use the .xml extension.

  Where as themes is a collection of attributes that's applied to an entire app, activity. When you apply a theme, every view in the app or activity applies each of the theme's attributes that it supports. Themes can also apply styles to non-view elements, such as the status bar and window background.
  
  
## Create and apply a style
To create a new style or theme, open your project's res/values/styles.xml file. For each style you want to create, follow these steps:

* Add a <style> element with a name that uniquely identifies the style.
* Add an <item> element for each style attribute you want to define.
* The name in each item specifies an attribute you would otherwise use as an XML attribute in your layout. The value in the <item> element is the value for that attribute.

For example, if you define the following style:
  
     <?xml version="1.0" encoding="utf-8"?>
    <resources>
        <style name="MyText" parent="TextAppearance.AppCompat">
            <item name="android:textColor">#00FF00</item>
        </style>
    </resources>
  
  ## Apply the theme
  
      <resources>
       ...
          <style name="MyTheme" parent=...>
             ...
             <item name="android:buttonStyle">@style/MyButton</item>
          </style>
       ...
    </resources>

## Apply a style as a theme
  You can create a theme the same way you create styles. The difference is how you apply it: instead of applying a style with the style attribute on a view, you apply a theme with the android:theme attribute on either the <application> tag or an <activity> tag in the AndroidManifest.xml file.

For example, here's how to apply the Android Support Library's material design "dark" theme to the whole app:
  
        <manifest ... >
          <application android:theme="@style/Theme.AppCompat" ... >
          </application>
      </manifest> 
  
  And here's how to apply the "light" theme to just one activity we can adjust or change the theme of our application as user needed:
  
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
         <style name="MyTheme" ...>
            <item name="android:windowBackground">@color/my_custom_color</item>
            <item name="android:colorBackgroundCacheHint">@color/my_custom_color</item>
         </style>
         ...
      </resources>
  
  ![theme](https://user-images.githubusercontent.com/102367845/193401550-4881ec95-beb2-4d7c-b7a9-130462a89314.png)
  
  ## Themes versus Styles
  
  Themes and styles have many similarities, but they are used for different purposes. Themes and styles have the same basic structure—a key-value pair which maps attributes to resources.

A style specifies attributes for a particular type of view. For example, one style might specify a button's attributes. Every attribute you specify in a style is an attribute you could set in the layout file. By extracting all the attributes to a style, it's easy to use and maintain them across multiple widgets.

A theme defines a collection of named resources which can be referenced by styles, layouts, widgets, and so on. Themes assign semantic names, like colorPrimary, to Android resources.

Styles and themes are meant to work together. For example, you might have a style that specifies that one part of a button should be colorPrimary, and another part should be colorSecondary. The actual definitions of those colors is provided in the theme. When the device goes into night mode, your app can switch from its "light" theme to its "dark" theme, changing the values for all those resource names. You don't need to change the styles, since the styles are using the semantic names and not specific color definitions.
  
