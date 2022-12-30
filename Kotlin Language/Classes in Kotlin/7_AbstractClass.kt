/* Points to remember:

1. We can’t create an object for abstract class.
2. All the variables (properties) and member functions of an abstract class are by default non-abstract. So, if we want to override these members in the child class 
   then we need to use open keyword.
3. If we declare a member function as abstract then we does not need to annotate with open keyword because these are open by default.
4. An abstract member function doesn’t have a body, and it must be implemented in the derived class.         */


open class Person(val name: String)
{
    open fun doWork()
    {
        println("Doing some stuff")
    }
    
    fun Talking() { }
}

class Student(name: String, val college: String): Person(name)
{
    override fun doWork()
    {
        println("Studying broo..")
    }
}

fun main()
{
    val obj = Student("Utkarsh","GL BAJAJ")
    obj.doWork()
}

// OUTPUT : Studying broo..


 /* Every class which inherits the Person class overrides the function doWork, so no need to have implementation of doWork(). So, abstract class comes into the 
 picture. */
 
 
abstract class Person(val name: String)
{
    abstract fun doWork()  // Read Point 4
    
    fun Talking() { }
}

class Student(name: String, val college: String): Person(name)
{
    override fun doWork()
    {
        println("Studying broo..")
    }
}

fun main()
{
    val obj = Student("Utkarsh","GL BAJAJ")
    obj.doWork()
}

// Ouput remains same
