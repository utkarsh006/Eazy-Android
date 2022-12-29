// READ DOCS HERE : https://kotlinlang.org/docs/inheritance.html
// Any is the parent of all the classes.

open class Person(val name:String)
{
    init{
        println("I am a Person")
    }
    
    open var age:Int=20
    open fun doWork()
    {
        println("Doing Work Now")
    }
}

class Student(name: String, val college: String, override var age:Int) : Person(name)
{
    init{
        println("I am a Student")
    }
    
    override fun doWork()
    {
        println("Studying brooo")
    }
}

fun main()
{
    val student = Student("Utkarsh","GL BAJAJ",15)
    student.doWork()
    println("Age : ${student.age}")
}

/* OUTPUT 

I am a Person
I am a Student
Studying brooo    //overriden function is called
Age : 15        */


/*  Wanna access Parent class function? Use super keyword

override fun doWork()
{
   println("Studying brooo")
   super.doWork()
}
    
    
