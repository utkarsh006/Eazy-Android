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
Now if you're curious, I hope you are 😏, you might be wondering what the heck is this `xmlns:app="http://schemas.android.com/apk/res-auto"`, and why 
http://schemas.android.com/apk/res-auto is not pointing anywhere, right?

So here comes the concept of **XMLNS**, which simply means **eXtensive Markup Language Namespaces**. 
Ok, so now you know the full form of XMLNS but what is the use of it?

Namespaces (anywhere, in any programming/scripting language) helps us to avoid naming collisions. 
Let's assume a simple scenario of two classrooms in a college. Both the classrooms have a boy named 'Joy'. Now whenever someone calls 'Joy', the conflict that which 'Joy' 
is being called will arrise. To avoid this scenario, we simply add a namespace which will tell there are two 'Joy's, one in 'classroom-1', other in 'classroom-2'.
Here the namespace is 'classroom-1, 'classroom-2'.
