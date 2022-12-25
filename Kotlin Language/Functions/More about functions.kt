// ************************* DEFAULT ARGUMENTS *************************

fun main() 
{
  printName("Seeta","Geeta")
  printName("Seeta")
}

fun printName(firstName: String, secondName: String = "Justin")
{
    println("Name is : $firstName $secondName")
}

/* OUTPUT 

Name is : Seeta Geeta
Name is : Seeta Justin   */





// ************************* NAMED ARGUMENTS *************************

fun main() 
{
  println(volume("Rectangle",1,height=10, width=5))
}

fun volume(shapeName: String, length: Int, width: Int, height: Int): Int
{
    println(shapeName)  
    return length * width * height
}

/* Explanation : When the function volume is called : 
           Rectangle is matched with shapename
           1 is matched with length
           Now, kotlin automatically matches height=10 to height not to width and same goes for the parameter width.

OUTPUT :  
Rectangle
50   */




// ************************* SINGLE EXPRESSIONS *************************

fun main()
{
    println(add(3,5))
}

fun add(num1: Int, num2: Int) : Int
{
    return num1+num2
}

// The functions who have single expression in their body can be rewritten as below :)

fun add(num1: Int, num2: Int) = num1+num2


// OUTPUT : 8
