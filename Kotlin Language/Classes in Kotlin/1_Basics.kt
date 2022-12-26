// BASIC STRUCTURE

class Student{
    
}

fun main()
{
    val obj:Student = Student()
}

// ************** PROPERTIES OF CLASSES **************

class Student{
    
    val college: String = "GL BAJAJ"
    var age : Int = 10
    
    val isTeen: Boolean
       get() = age>12
    
    var name: String?= null
    
       get() = field ?: "Unknown"    // This is backing field, we don't assign value to the name here since it could generate a recursive condition.
    
       set(value){
           if(value != null) field=value
       }
    
}

fun main()
{
    val obj:Student = Student()
    
    println("Student is teenager : ${obj.isTeen}")
    obj.age = 18
    println("Student is teenager : ${obj.isTeen}")
    
    println("Student name is : ${obj.name}")
    obj.name="Raj"
    println("Student name is : ${obj.name}")
    
}

/* OUTPUT

Student is teenager : false
Student is teenager : true
Student name is : Unknown
Student name is : Raj    */
 
