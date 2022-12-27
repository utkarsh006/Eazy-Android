// DOCS : https://kotlinlang.org/docs/classes.html#constructors

class Student(firstName: String="Anuj")
{
    val firstName: String
    var lastName : String?= null
    
    init{
        println("init block is called")
        this.firstName = firstName
    }
    
    //declaring secondary constructor
    constructor(firstName: String, lastName: String): this(firstName)
    {
        println("Secodary constructor is called")
        this.lastName = lastName
    }
}

fun main() {
   val obj: Student = Student("Utkarsh")
   println("Name: ${obj.firstName} ${obj.lastName} ")
}

/* OUTPUT

init block is called
Name: Utkarsh null 

Output Explanation : Since, obj is created hence primary constructor is called by default, so "init block is called" is printed, while lastname remains as null 
so Utkarsh null is printed. We can also say that user passed one parameter to call the primary constructor  */

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

// Now calling Secondary constructor .........

fun main() {
   val obj: Student = Student("Utkarsh", "Saxena")
   println("Name: ${obj.firstName} ${obj.lastName} ")
}


/* OUTPUT 

init block is called
Secodary constructor is called
Name: Utkarsh Saxena */

