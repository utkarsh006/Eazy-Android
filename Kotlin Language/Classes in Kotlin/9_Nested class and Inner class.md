## Nested Class 
- These can’t access the members of the outer class, but we can access the property of nested class from the outer class without creating an object for nested class.
- In Kotlin, to access the member function of nested class, we need to create the object for nested class and call the member function using it.

## Kotlin Inner Class
- When we can declare a class inside another class using the keyword inner then it is called inner class.
- With the help of the inner class, we can access the outer class property inside the inner class. 


```
class Woman(val name:String)
{
    inner class Makeup()
    {
        fun printOwner()
        {
            println("This Lipstick belongs to : $name ")
        }
    }
}

fun main()
{
    Woman("Selena").Makeup().printOwner()
}

// OUTPUT : This Lipstick belongs to : Selena 

```

<br>

<p align="center">
<img height="300" src="https://user-images.githubusercontent.com/94545831/210055502-5a87e18c-579f-4c7a-8085-4e2fd3a50492.png" /></p>
