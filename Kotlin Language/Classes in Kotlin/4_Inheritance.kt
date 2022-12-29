/* In Kotlin, all the classes are final by default i.e. they can’t be inherited by default.So, to make a class inheritable to the other classes, you must mark it 
with the open keyword otherwise you will get an error saying “ type is final so can’t be inherited ”.   */

open class Person(val name:String)
{
    init{
        println("I am a Person")
    }
    
    var age:Int=20
    fun doWork()
    {
        println("Doing Work Now")
    }
}

class Student(name: String, val college: String) : Person(name)
{
    init{
        println("I am a Student")
    }
}

fun main()
{
    val student = Student("Utkarsh","GL BAJAJ")
    student.doWork()
    println("Age : ${student.age}")
}


/* OUTPUT 

I am a Person
I am a Student
Doing Work Now
Age : 20

Student class is called with the parameters as ("Utkarsh","GL BAJAJ") since it's inherited from Person class so Person's primary constructor is called.
Hence, I am a Person is printed.

Now, Student's primary constructor is called, hence I am a Student is printed.

Now, doWork() is called through object student hence, Doing Work Now is printed and similarly, Age : 20 is printed.    */

