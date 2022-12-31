open class Person(val name: String)

class Student(name:String) : Person(name)

fun main()
{
    //for each class 2 types are generated, nullable and non nullable
    val age: Int = 20
    val rollNumber: Int?= 5
    
    //subtype
    val student: Student = 	Student("Yash")
    val person: Person = student
    
    //corresponding non nullable types are the subtype of nullable types
    // Int -> Int?,  Person-> Person?
  
    val x: String = "Yash"
    val y: String ?= x
    
}
