## Layout and its types
The basic building block for user interface is a View object which is created from the View class and occupies a rectangular area on the screen and is responsible for drawing and event handling. View is the base class for widgets, which are used to create interactive UI components like buttons, text fields, etc.

The ViewGroup is a subclass of View and provides invisible container that hold other Views or other ViewGroups and define their layout properties.

At third level we have different layouts which are subclasses of ViewGroup class and a typical layout defines the visual structure for an Android user interface and can be created either at run time using View/ViewGroup objects or you can declare your layout using simple XML file main_layout.xml which is located in the res/layout folder of your project.

# Layout
As explained above, designing gets done in these stages:
1. you have view that is base class for widgets like button, textView etc...
2. you have group of those views, an invisible container that holds other views which can be termed as      ViewGroup like RecyclerView, ListView etc...
3. We have layouts like LinearLayout, RelativeLayout etc... that hold views and viewgroups. 
 
When you open any activity.xml file you get to see a parent Layout (usually ConstraintLayout) that holds view and viewgroups as child in it. 
<br> 
Lets understand the graph:
<br><hr>
<pre>
                                View
                                  |
                    ImageView   TextView  ViewGroup
                                  |           |
                                Button        |
                                              |
                            LinearLayout  FrameLayout  RelativeLayout
                                                               

</pre>
<hr>

Typical syntax is as follows:
<br><hr> 
<pre>
< ? xml version="1.0" encoding="utf-8"?>
< LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
   android:layout_width="fill_parent"
   android:layout_height="fill_parent"
   android:orientation="vertical" >
   
   < TextView android:id="@+id/text"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:text="This is a TextView" />
      
   < Button android:id="@+id/button"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:text="This is a Button" />
      
   <!-- More GUI components go here  -->
   
< / LinearLayout >
</pre>
Once your layout has created, you can load the layout resource from your application code, in your Activity.onCreate() callback implementation as follows --
<br><hr><pre>
public void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_main);
}
</pre>
<hr>

# Types of Layout
There are numerous Layouts provided by Android which you will use in almost all the Android applications to provide different view, look and feel.
Let's look at some of the layouts:

## 1. GridView: GridView is a ViewGroup that displays items in a two-dimensional, scrollable grid.
Lets consider UI of Myntra's fashion wear page. We can see a scrollable 2D list of items. Though there is a use of recyclerview there but the layoutManager is set to gridview there too. So, GridView is used when there is a requirement of displaying list in 2D

<br>
<pre>

                               ___________________________
                              |                           |
                              |                           |
                              |       __          __      |
                              |      |  |        |  |     |
                              |      |__|        |__|     |
                              |                           |
                              |                           |
                              |                           |
                              |       __           __     |
                              |      |  |         |  |    |
                              |      |__|         |__|    |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |       Grid of Views       |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |___________________________|

</pre>
<br>

## 2. ListView: ListView is a view group that displays a list of scrollable items.
ListView as the name suggests, displays items in list format that can be scrolled. All the items to be displayed are pre-loaded even if item is not visible on screen due to screen size unlike RecyclerView wherein only the items that are visible on user screen at a time ,are fetched.
<br>
<pre>

                               ___________________________
                              |                           |
                              |                           |
                              |       __          __      |
                              |      |  |        |  |     |
                              |      |__|        |__|     |
                              |                           |
                              |                           |
                              |                           |
                              |       __           __     |
                              |      |  |         |  |    |
                              |      |__|         |__|    |
                              |                           |
                              |                           |
                              |             .             |
                              |             .             |
                              |             .             |
                              |             .             |
                              |             .             |
                              |             .             |
                              |                           |
                              |                           |
                              |                           |
                              |_________Listiew___________|

</pre>
<br>

## 3. FrameLayout: The FrameLayout is a placeholder on screen that you can use to display a single view.
An example would be, if you want to have lottie animations in a particular part of screen or say a table in a particular part of screen then FrameLayout can be used. 

<br>
<pre>

                               ___________________________
                              |                           |
                              |                           |
                              |       ______________      |
                              |      |              |     |
                              |      |              |     |
                              |      |    Webpage   |     |
                              |      |              |     |
                              |      |              |     |
                              |      |              |     |
                              |      |              |     |
                              |      |______________|     |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |___________________________|

</pre>
<br>

## 4. AbsoluteLayout: AbsoluteLayout enables you to specify the exact location of its children.
In this layout, the exact location is specified of the child items present there. 

<br>
<pre>

                               ___________________________
                              |                           |
                              |                           |
                              |       _____               |
                              |      |(x,y)|              |
                              |      |_____|              |
                              |                           |
                              |                           |
                              |                           |
                              |                 _______   |
                              |                |(x2,y2)|  |
                              |                |_______|  |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |       AbsoluteLayout      |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |___________________________|

</pre>
<br>

## 5. TableLayout: TableLayout is a view that groups views into rows and columns.
If you wish to form a table and display it on screen just as we have tables in html file, you can use TableLayout and using its attributes you can design the rows and columns as per the requirements of Table.

<br>
<pre>

                               ___________________________
                              |                           |
                              |                           |
                              |                           |
                              |   _|_____Column______     |
                              |    |                      |
                              |   R|                      |
                              |   o|                      |
                              |   w|                      |
                              |    |                      |
                              |    |                      |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |         TableView         |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |___________________________|

</pre>
<br>


## 6. RelativeLayout: RelativeLayout is a view group that displays child views in relative positions.
Alan should sit next to Puja ,who is sitting behind Dmitriv.
Well, this can be precisely made possible using RelativeLayout wherein you can define that button should be toLeftOf textView.

<br>
<pre>

                               ___________________________
                              |                           |
                              |                           |
                              |                 _________ |
                              |                |         ||
                              |                |(Button1)||
                              |                |_________||
                              |                           |
                              |                           |
                              |                           |
                              |       _________           |
                              |      |         |          |
                              |      |(Button1)|          |
                              |      |  below  |          | 
                              |      | toLeftOf|          |
                              |      |  button1|          |
                              |      |_________|          |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |       RelativeLayout      |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |                           |
                              |___________________________|

</pre>
<br>

## 7. LinearLayout: LinearLayout is a view group that aligns all children in a single direction, vertically or horizontally.
Unlike RelativeLayout, LinearLayout places items in single direction be it horizontal or verticle. A straight line format is followed here.

<br>
<pre>

                               ___________________________
                              |                           |
                              |                           |
                              |       ______________      |
                              |      |              |     |
                              |      |              |     |
                              |      |    Button 1  |     |
                              |      |              |     |
                              |      |              |     |
                              |      |              |     |
                              |      |              |     |
                              |      |______________|     |
                              |                           |
                              |                           |
                              |       ______________      |
                              |      |              |     |
                              |      |              |     |
                              |      |    Button 2  |     |
                              |      |              |     |
                              |      |              |     |
                              |      |              |     |
                              |      |              |     |
                              |      |______________|     |
                              |                           |
                              |________LinearLayout_______|

</pre>
<br>


## Attributes of layout:
1. android:id
This is the ID which uniquely identifies the view.

2. android:layout_width
This is the width of the layout.

3. android:layout_height
This is the height of the layout

4. android:layout_marginTop
This is the extra space on the top side of the layout.

5. android:layout_marginBottom
This is the extra space on the bottom side of the layout.

6. android:layout_marginLeft
This is the extra space on the left side of the layout.

7. android:layout_marginRight
This is the extra space on the right side of the layout.

8. android:layout_gravity
This specifies how child Views are positioned.

9. android:layout_weight
This specifies how much of the extra space in the layout should be allocated to the View.

10. android:layout_x
This specifies the x-coordinate of the layout.

11. android:layout_y
This specifies the y-coordinate of the layout.

12. android:layout_width
This is the width of the layout.

13. android:paddingLeft
This is the left padding filled for the layout.

14. android:paddingRight
This is the right padding filled for the layout.

15. android:paddingTop
This is the top padding filled for the layout.

16. android:paddingBottom
This is the bottom padding filled for the layout.