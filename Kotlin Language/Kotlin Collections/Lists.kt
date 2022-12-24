// REFER DOCS : https://kotlinlang.org/docs/list-operations.html

fun main()
{
  val names = listOf("Ayush", "Rajat", "Prakhar", "Abhi")
  
  println("LIST SIZE : ${names.size}")                         // OUTPUT : 4 , as there are 4 items in the list names.
  println("Third Item in the List : ${names.get(2)}")         // OUTPUT : Prakhar, list follows 0 based indexing   
  println("Abhi is at index : ${ names.indexOf("Abhi") }" )  // OUTPUT : Abhi is at index : 3
  
  // This is mutable list which means that we can't add/ delete items in the list.
  // If we want such functionalities we have to create an immutable list.
  
}

fun main()
{
  val names = mutableListOf("Ayush", "Rajat", "Abhi")
  names.add("Yash")
  println(names)                // OUTPUT : [Ayush, Rajat, Abhi, Yash]
  
  names.removeAt(1)
  println(names)              // OUTPUT : [Ayush, Abhi, Yash]
  
  names.set(0,"Ravi")
  names[1] = "Kishan"
  println(names)            // OUTPUT : [Ravi, Kishan, Yash]
  
  names.clear()
  println(names)           // OUTPUT : []
  
}

