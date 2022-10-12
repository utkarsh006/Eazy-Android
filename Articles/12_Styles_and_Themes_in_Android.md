# Android - Styles and Themes


Styles and themes on Android allow you to separate the details of your app design from the UI structure and behavior,
similar to stylesheets in web design.

A style is a collection of attributes that specify the appearance for a single View. A style can specify attributes such as font color, font size,
background color, and much more.

A theme is a collection of attributes that's applied to an entire app, activity, or view hierarchy—not just an individual view.
When you apply a theme, every view in the app or activity applies each of the theme's attributes that it supports. Themes can also apply styles
to non-view elements, such as the status bar and window background.

The Android styling system offers a powerful way to specify your app’s visual design, but it can be easy to misuse. Proper use of it can 
make themes and styles easier to maintain, make branding updates less scary and make it straightforward to support dark modes.

## Themes versus Styles

 Themes and styles have many similarities, but they are used for different purposes. Themes and styles have the same basic 
 structure—a key-value pair which maps attributes to resources.

A style specifies attributes for a particular type of view. For example, one style might specify a button's attributes. Every 
attribute you specify in a style is an attribute you could set in the layout file. By extracting all the attributes to a style,
it's easy to use and maintain them across multiple widgets.

A theme defines a collection of named resources which can be referenced by styles, layouts, widgets, and so on. Themes assign
semantic names, like colorPrimary, to Android resources.

Styles and themes are meant to work together. For example, you might have a style that specifies that one part of a button
should be colorPrimary, and another part should be colorSecondary. The actual definitions of those colors is provided in the
theme. When the device goes into night mode, your app can switch from its "light" theme to its "dark" theme, changing the values
for all those resource names. You don't need to change the styles, since the styles are using the semantic names and not specific color definitions. 

## Create and apply a style

To create a new style or theme, open your project's res/values/styles.xml file. For each style you want to create, follow these steps:

  1. Add a <style> element with a name that uniquely identifies the style.
  2. Add an <item> element for each style attribute you want to define. 
     The name in each item specifies an attribute you would otherwise use as an XML attribute in your layout. 
     The value in the <item> element is the value for that attribute.
  
For example, if you define the following style:
  
```
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <style name="GreenText" parent="TextAppearance.AppCompat">
        <item name="android:textColor">#00FF00</item>
    </style>
</resources>
```

You can apply the style to a view as follows:
  
```
<TextView
    style="@style/GreenText"
    ... />
```
  
Each attribute specified in the style is applied to that view if the view accepts it.
The view simply ignores any attributes that it does not accept.

  
> Note: Only the element to which you add the style attribute receives those style attributes—any child views do not apply the styles.
  If you want child views to inherit styles, instead apply the style with the android:theme attribute.

  
However, instead of applying a style to individual views, you'll usually apply styles as a theme for your 
entire app, activity, or collection of views.

  
## Extend and customize a style
  
When creating your own styles, you should always extend an existing style from the framework or support library so that you
maintain compatibility with platform UI styles. To extend a style, specify the style you want to extend with the parent attribute. You can then override the inherited style attributes and add new ones.

For example, you can inherit the Android platform's default text appearance and modify it as follows:
  
  ```
  <style name="GreenText" parent="@android:style/TextAppearance">
    <item name="android:textColor">#00FF00</item>
  </style>
  ```
  
  However, you should always inherit your core app styles from the Android Support Library. The styles in the support library provide 
  compatibility with Android 4.0 (API level 14) and higher by optimizing each style for the UI attributes available in each version. 
  The support library styles often have a name similar to the style from the platform, but with AppCompat included.

  To inherit styles from a library or your own project, declare the parent style name without the @android:style/ part shown above.
  For example, the following example inherits text appearance styles from the support library:
  
  ```
  <style name="GreenText" parent="TextAppearance.AppCompat">
    <item name="android:textColor">#00FF00</item>
  </style>
  ```
  You can also inherit styles (except those from the platform) by extending a style's name with a dot notation, instead of using the parent
  attribute. That is, prefix the name of your style with the name of the style you want to inherit, separated by a period. You should usually 
  do this only when extending your own styles, not styles from other libraries. For example, the following style inherits all styles from 
  the GreenText style above and then increases the text size:
  
  
  ```
  <style name="GreenText.Large">
    <item name="android:textSize">22dp</item>
  </style>
  ```
  
  You can continue inheriting styles like this as many times as you'd like by chaining on more names.
  
  > Note: If you use the dot notation to extend a style, and you also include the parent attribute,
    then the parent styles override any styles inheritted through the dot notation.
  
  To find which attributes you can declare with an <item> tag, refer to the "XML attributes" table in the various class references.
  All views support XML attributes from the base View class, and many views add their own special attributes. For example, the TextView 
  XML attributes includes the android:inputType attribute that you can apply to a text view that receives input, such as an EditText widget.

  
## Apply a style as a theme
  
  You can create a theme the same way you create styles. The difference is how you apply it: instead of applying a style with 
  the style attribute on a view, you apply a theme with the android:theme attribute on either the <application> tag or an <activity> tag in 
  the AndroidManifest.xml file.

  For example, here's how to apply the Android Support Library's material design "dark" theme to the whole app: 
  
  ```
  <manifest ... >
    <application android:theme="@style/Theme.AppCompat" ... >
    </application>
  </manifest>
  ```
  
  And here's how to apply the "light" theme to just one activity:
  
  
  ```
  <manifest ... >
    <application ... >
        <activity android:theme="@style/Theme.AppCompat.Light" ... >
        </activity>
    </application>
  </manifest>
  ```
  
  Now every view in the app or activity applies the styles defined in the given theme. If a view supports only some of the attributes 
  declared in the style, then it applies only those attributes and ignores the ones it does not support.

  Beginning with Android 5.0 (API level 21) and Android Support Library v22.1, you can also specify the android:theme attribute
  to a view in your layout file. This modifies the theme for that view and any child views, which is useful for altering theme color
  palettes in a specific portion of your interface.

  The previous examples show how to apply a theme such as Theme.AppCompat that's supplied by the Android Support Library. But you'll 
  usually want to customize the theme to fit your app's brand. The best way to do so is to extend these styles from the support library
  and override some of the attributes, as described in the next section.
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
