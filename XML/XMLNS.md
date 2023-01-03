# XMLNS

You might have seen something like this in our Android XML files. No?

```
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    
    //some layouts
    
</androidx.constraintlayout.widget.ConstraintLayout>
```
Now if you're curious, you might be wondering what the heck is this `xmlns:app="http://schemas.android.com/apk/res-auto"`, and why 
http://schemas.android.com/apk/res-auto is not pointing anywhere, right?

So here comes the concept of **XMLNS**, which simply means **eXtensive Markup Language Namespaces**. 
Ok, so now you know the full form of XMLNS but what is the use of it?

Namespaces (anywhere, in any programming/scripting language) helps us to avoid naming collisions. 
Let's assume a simple scenario of two classrooms in a college. Both the classrooms have a boy named 'Joy'. Now whenever someone calls 'Joy', the conflict that which 'Joy' 
is being called will arrise. To avoid this scenario, we simply add a namespace which will tell there are two 'Joy's, one in 'classroom-1', other in 'classroom-2'.
Here the namespace is 'classroom-1, 'classroom-2'.

Now let's understand the same, but technically.

Firstly, the syntax of defining a namespace in XML is something like `xmlns:prefix="URI"`. Now, compare it with `xmlns:app="http://schemas.android.com/apk/res-auto"` to get to know that http://schemas.android.com/apk/res-auto is just a URI (Uniform Resource Identifier), which is used to identify a name of resource that may or may not
be connected to the internet.

Let's take this typical example for understanding:
```
<table>
  <tr>
    <td>Java</td>
    <td>Kotlin</td>
  </tr>
</table>

<table>
  <name>House Boat</name>
  <width>300</width>
  <length>600</length>
</table>
```
As there are two tables, and if you use them in a same XML file, the naming conflict will arrise. Now, in order to differentiate them, we would need to add 'xmls' onto the root and use the 'prefix' everywhere in the XML. Something like:

```
<lang:table xmlns:lang='http://temp/languages'>
  <lang:tr>
    <lang:td>Java</lang:td>
    <lang:td>Kotlin</lang:td>
  </lang:tr>
</lang:table>

<boat:table xmlns:boat='http://house/boats'>
  <boat:name>House Boat</boat:name>
  <boat:width>300</boat:width>
  <boat:length>600</boat:length>
</boat:table>
```
In a similar fashion, let's say you define your own custom Edit Text with some additional features. Now there are two Edit Texts, one that you made and the other which android provides. So while declaring your custom Edit Text in XML, it would give an error at the time of compilation, which would ultimately tell that there is some naming conflict between the two Edit Texts (your custom and android's own). Hence, to solve this issue, **XMLNS** helps us and let's us distinguish between the two.

**So to summarize all this, XMLNS provides us a way to distinguish between the different elements and attributes in XML.**
