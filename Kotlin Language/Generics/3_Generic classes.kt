// If you have many functions, and we want to invoke these functions with different datatypes we can create the class type parameter itself.

class Student<T>()
{
    fun show(content:T)
    {
        println("Content is : $content")
    }
}

fun main()
{
    val obj = Student<String>()
    obj.show("Utkarsh")
    
    val obj1 = Student<Int>()
    obj.show("20")
}


/* OUTPUT 

Content is : Utkarsh
Content is : 20        */
