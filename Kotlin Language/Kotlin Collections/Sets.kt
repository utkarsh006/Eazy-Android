// Docs : https://kotlinlang.org/docs/set-operations.html

fun main()
{
  val names = setOf("Abhi","Yash","Raj")
  
  println("Set Size : ${names.size}")                    // OUTPUT : Set Size : 3
  println("Set contains : ${names.contains("Raj")}")    // OUTPUT : Set contains : true
  println("Set contains : ${names.contains("Ram")}")   // OUTPUT :  Set contains : false   
}


fun main()
{
  val names = mutableSetOf("Abhi","Yash","Raj")
  names.add("Ayush")
  println(names)                  // OUTPUT : [Abhi, Yash, Raj, Ayush]

  names.remove("Yash")
  println(names)                 // OUTPUT : [Abhi, Raj, Ayush]
  
}
