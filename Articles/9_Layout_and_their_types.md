# Layouts - types, attributes, and properties

The basic building block for user interfaces is a **View object** that is responsible for drawing and event handling. 

Designing is done in three stages:

- **View** is the base class for widgets, which are used to create interactive UI components like buttons, text fields, etc. A View object is created from the View class and occupies a rectangular area on the screen.
- **ViewGroup**: Subclass of the View class. Provides an invisible container that hold other Views or other ViewGroups and define their layout properties. Examples are RecyclerView, ListView, etc.
- **Layouts**: Subclasses of the ViewGroup class. A typical layout defines the visual structure for an Android user interface. You can create it either at run time using View/ViewGroup objects or you can declare your layout using simple XML file main_layout.xml which is located in the res/layout folder of your project. Examples are LinearLayout, RelativeLayout, etc.

When you open any *activity.xml* file, you see a parent Layout (usually <b>ConstraintLayout</b>) that holds view and viewgroups as child in it. 

<pre>
                                View
                                  |
                    ImageView   TextView  ViewGroup
                                  |           |
                                Button        |
                                              |
                            LinearLayout  FrameLayout  RelativeLayout
                                                               

</pre>

The typical content is as follows: 

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

Once your layout has been created, you can load the layout resource from your application code, in your `Activity.onCreate()` callback implementation as follows:

<pre>
public void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_main);
}
</pre>

## Layout properties

- Layouts are subclasses of *ViewGroup* class and define the visual structure for an Android user interface
- Create your layouts at run time using View/ViewGroup objects or declare your layout using an XML file main_layout.xml which is located in the res/layout folder of your project.

## Different layout types

There are numerous Layouts provided by Android which you will use in almost all the Android applications to provide different view, look and feel. Let's look at some of the layouts below.

## GridView: ViewGroup to display items in a two-dimensional and scrollable grid

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

## ListView: ViewGroup to display a list of scrollable items

ListView as the name suggests, displays items in list format that can be scrolled. All the items to be displayed are pre-loaded even if item is not visible on screen due to screen size unlike RecyclerView wherein only the items that are visible on user screen at a time , are fetched.

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

##  FrameLayout: Placeholder on screen that you can use to display a single view

An example would be, if you want to have lottie animations in a particular part of screen or say a table in a particular part of screen then FrameLayout can be used. 

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

##  AbsoluteLayout: Specify the exact location of its children

In this layout, the exact location is specified of the child items present there. 

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

## TableLayout: View that groups views into rows and columns

If you wish to form a table and display it on screen just as we have tables in html file, you can use TableLayout and using its attributes you can design the rows and columns as per the requirements of Table.

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

## RelativeLayout: ViewGroup that displays child views in relative positions

Alan should sit next to Puja who is sitting behind Dmitriv.

Well, this can be precisely made possible using RelativeLayout wherein you can define that button should be toLeftOf textView.

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

## LinearLayout: ViewGroup that aligns all children in a single direction (vertically or horizontally)

Unlike RelativeLayout, LinearLayout places items in single direction be it horizontal or verticle. A straight line format is followed here.

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

## Constraint Layout: Views in this layout have are alinged with a invisible constraint

Consider constraints as springs attached to all the 4 sides of your view. This binds the view from moving to random place (defined in pixels) while in runtime as the application will run on multiple devices of different shape and forms. The spring mechanism (just to explain) helps to fix the view at one place.
Constraints are as follows:
- topToBottomOf: Align the top of view to bottom of parent or other view.
- topToTopOf: Align the top of view to top of parent or other view.
- bottomToBottomOf: Align the bottom of view to bottom of parent or other view.
- bottomToTopOf: Align the bottom of view to top of parent or other view.

<pre>

                               ___________________________
                              |             /             |
                              |             \             |
                              |       ______/_______      |
                              |      |              |     |
                              |      |              |     |
                              |      |    Button    |     |
                              |\/\/\/|              |\/\/\|
                              |      |              |     |
                              |      |              |     |
                              |      |              |     |
                              |      |______________|     |
                              |            \              |
                              |            /              |
                              |            \              |
                              |            /              |
                              |            \              |
                              |            /              |
                              |            \              |
                              |            /              |
                              |            \              |
                              |            /              |
                              |            \              |
                              |____________/______________|

</pre>

## Layout attributes

Attribute                   | Details
--------------------------- | ---------------------------------------------
android:id                  | ID which uniquely identifies the view
android:layout_width        | width of the layout
android:layout_height       | Height of the layout
android:layout_marginTop    | Extra space on the top side of the layout.
android:layout_marginBottom | Extra space on the bottom side of the layout
android:layout_marginLeft   | Extra space on the left side of the layout
android:layout_marginRight  | Extra space on the right side of the layout
android:layout_gravity      | Specifies how child Views are positioned.
android:layout_weight       | Specifies how much of the extra space in the layout should be allocated to the View.
android:layout_x            | Specifies the x-coordinate of the layout
android:layout_y            | Specifies the y-coordinate of the layout
android:layout_width        | Width of the layout
android:paddingLeft         | Left padding filled for the layout
android:paddingRight        | Right padding filled for the layout
android:paddingTop          | Top padding filled for the layout
android:paddingBottom       | Bottom padding filled for the layou
