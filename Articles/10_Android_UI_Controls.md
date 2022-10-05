# Top Android UI Controls that you must know about!

Android UI Controls are those components of Android that are used to design the UI in a more interactive way. It helps us
to develop an application that makes user interaction better with the view components. Android provides us a huge range of
UI controls of many types such as buttons, text views, etc.

As we know UI is the only thing that a user interacts with within an Application. This is the reason that we make our
Application look aesthetic and, more and more connective. To do so, we need to add the UI controls or we say Input controls 
in the respective application.

## 1. TextView

TextView is a UI Component that displays the text to the user on their Display Screen.
We can create it in two ways:

XML file:

For this, we declare it in the layout tag as follows:

```
<Linear Layout xmls:android= "http://schemas.android.com/apk/res/android"
        <TextView
        //attributes to describe it
        />
</LinearLayout>
```

Activity file:

In this, we declare it using the setText() method as follows:

```
setContentView(R.layout.activity_main);
LinearLayout linearlayout_name = (LinearLayout)findViewById(R.id.LinearLayout);
TextView textview_name = new TextView(this);
textveiw_name.setText(“Hello I am Text View”);
linearLayout.addView(textView);
```
There are various attributes to describe the TextView some of them are named below:

* Android: id – it is a unique id for the control.
* Android: width – It displays the exact width of the TextView.
* Android: height – It displays the exact height of the TextView.
* Android:textColor – It set the color of the text.
* Android: gravity – It is to align the TextView.

There are some more attributes the above are the major ones.

## 2. EditText

EditText is a user interface control that allows the users to enter some text.
We can create it in two ways:

XML file:

For this, we declare it in the layout tag as follows:

```
<Linear Layout xmls:android= ”http://schemas.android.com/apk/res/android”>
       <EditText
       //attributes
       > 
</LinearLayout>
```

Activity file:

In activity, we declare it using the getText() method as follows:

```
setContentView(R.layout.activity_main);
LinearLayout linearlayout_name = (LinearLayout) findViewById (R.id.LinearLayout) ;
EditText edittext_name = new EditText(this);
edittext_name.setHint(“Hello I am EditText”);
linearLayout.addView(edittext_name);
```

## 3. Button

This is a UI that is used to perform some action as soon as the user clicks on it.
We can create it in two ways:

XML file:

For this, we declare it in the layout tag as follows:

```
<Linear Layout xmls:android= ”http://schemas.android.com/apk/res/android”>
       <Button
       //attributes
       />
</LinearLayout>
```

Activity file:

In activity, we declare it programmatically as below:

```
setContentView(R.layout.activity_main);
LinearLayout linearlayout_name = (LinearLayout)findViewById(R.id.LinearLayout);
Button btn_name = new Button(this);
btn_name.setText(“Hello I am Button”);
linearLayout.addView(btn_name);
```


## 4. ImageButton

It is the same as a Button but it’s used to display an image on the button to perform an Action. In this, we need to
give the source of the image so that the system can load it.

We can create it in two ways:

XML file:

For this, we declare it in the layout tag as follows:

```
<Linear Layout xmls:android= ”http://schemas.android.com/apk/res/android”>

<ImageButton
//other attributes...
android:src= “@drawable/add_icon”/>

</LinearLayout>
```

Activity file:

In the activity file, we declare it programmatically as below:

```
setContentView(R.layout.activity_main);
LinearLayout linearlayout_name = (LinearLayout)findViewById(R.id.LinearLayout);
ImageButton btn_name = new Button(this);
btn_name.setImageResource(R.drawable.add_icon);
linearLayout.addView(btn_name);
```

## 5. ToggleButton

The toggle button displays the ON/OFF states of a button with a light indicator.

We can create it in two ways:

XML file:

For this, we declare it in the layout tag as follows:

```
<Linear Layout xmls:android= ”http://schemas.android.com/apk/res/android”>

<ToggleButton
        //attributes
        android:checked="true"
        android:textOff="OFF"
        android:textOn="ON"/>
</LinearLayout>
```
Activity file:

In the activity file we declare it programmatically as below:

```
setContentView(R.layout.activity_main);
LinearLayout linearlayout_name = (LinearLayout)findViewById(R.id.LinearLayout);
ToggleButton tb_name = new ToggleButton(this);
tb_name.setTextOff("OFF");
tb_name.setTextOn("ON");
tb_name.setChecked(true);
linearLayout.addView(btn_name);
```

## 6. RadioButton

Radio button in Android is the one that has only two possible states, that are either checked or unchecked.
Initially, it is in the unchecked state, once it’s checked it can’t be unchecked.

We can create it in two ways:

XML file:

For this, we declare it in the layout tag as follows:

```
<Linear Layout xmls:android= ”http://schemas.android.com/apk/res/android”>
  <RadioButton
  android:text="Radio button"
  android:checked="true"/>
</LinearLayout>
```
Activity file:

In the activity file, we declare it programmatically as below:
```
setContentView(R.layout.activity_main);
LinearLayout linearlayout_name = (LinearLayout)findViewById(R.id.LinearLayout);
RadioButton btn_name = new RadioButton(this);
btn_name.setText("Hello");
btn_name.setChecked(true);
linearLayout.addView(btn_name);
```

## 7. RadioGroup

It’s a group of Radio buttons that are alike. In this, only one of all the buttons can be chosen.

We can create it in two ways:

XML file:

For this, we declare it in the layout tag as follows:

```
<Linear Layout xmls:android= ”http://schemas.android.com/apk/res/android”>

<RadioGroup android:orientation="vertical">
   <RadioButton android:text="Radio Button 1"/>
   <RadioButton android:text="Radio Button 2"/>
   <RadioButton android:text="Radio Button 3"/>
</RadioGroup>

</LinearLayout>
```
Activity file:

In the activity file, we declare it programmatically as below:
```
RadioButton rdb1,rdb2,rdb3;
@override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
rdb1 = (RadioButton)findViewById(R.id.rdb_1);
rdb2 = (RadioButton)findViewById(R.id.rdb_2);
rdb3 = (RadioButton)findViewById(R.id.rdb_3);
Button btn = (Button)findViewById(R.id.getBtn);
}
```
Above is the example to declare it, to make it functional, we would override and define the methods that are required.

## 8. CheckBox

A CheckBox is the UI control that has two states that are either checked or unchecked. If we have a group of CheckBox,
we can select as many as we want, unlike RadioGroup.

We can create it in two ways:

XML file:

For this, we declare it in the layout tag as follows:

```
<Linear Layout xmls:android= ”http://schemas.android.com/apk/res/android”>
  <CheckBox
  android:checked="true"
  android:text="CheckBox"
  // other attributes
  />
</LinearLayout>
```

Activity file:

In activity, we declare it programmatically as below:

```
setContentView(R.layout.activity_main);
LinearLayout linearlayout_name = (LinearLayout)findViewById(R.id.LinearLayout);
CheckBox cb_name = new CheckBox(this);
cb_name.setText("DataFlair");
cb_name.setChecked(true);
layout.addView(cb_name);
```

## 9. ProgressBar

In Android, we have a progress bar that shows the progress of some action that is happening like pasting a file to some location. A progress bar can be in two modes:

* terminate Mode:

In this, the progress is shown with the percent of action completed. Also, the time to be taken is already determined.

* determinate Mode:

In this, there is no idea of when the task would be completed, therefore, it functions continuously.

We can create it in two ways:

XML file:

For this, we declare it in the layout tag as follows:

```
<Linear Layout xmls:android=”http://schemas.android.com/apk/res/android”>
        <ProgressBar
        // attributes, here we define the speed, layout, id, etc.
        />
</LinearLayout>
```
Activity file:

In activity, we declare it programmatically as below:

```
setContentView(R.layout.activity_main);
pgsBar = (ProgressBar)findViewById(R.id.pBar);
txtView = (TextView)findViewById(R.id.tView);
Button btn = (Button)findViewById(R.id.btnShow);
```
Here we need to set the sleep time and override the onClick() and onCreate() methods



