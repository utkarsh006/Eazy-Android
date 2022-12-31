/*  DOCS : https://kotlinlang.org/docs/extensions.html

These functions behave as if they are the part of class itself.
Extensions do not actually modify the classes they extend. By defining an extension, you are not inserting new members into a class,
only making new functions callable with the dot-notation on variables of this type.  */


class Student(val firstName:String, val lastName:String)

//extension function
fun Student.fullName() = "${this.firstName} ${this.lastName}"

fun Int.getEven():Int   // extension function "getEven" is defined on the Int class
{
    if(this%2 == 0)  return this
    else return this+1
}

fun main()
{
    val obj = Student("Utkarsh","Saxena")
    
    println("Full name: ${obj.fullName()}")
    
    val x:Int=21
    println("Even age : ${x.getEven()}")
}


/*  OUTPUT 

Full name: Utkarsh Saxena
Even age : 22       */
