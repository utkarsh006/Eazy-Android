// DOCS : https://kotlinlang.org/docs/map-operations.html

fun main()
{
  val ranks = mapOf(1 to "Ajay", 2 to "Raj", 3 to "Yash", 4 to "Ayush")
  
  println("Students are : ${ranks.values}")
  println("Their Ranks are : ${ranks.keys}")
  println("Justin has got a rank : ${ranks.containsValue("Justin")}" )
  println("There is a second rank : ${ranks.containsKey(2)}")
  println("The student at topmost position is : ${ranks.get(1)}")
}

/*   OUTPUT 

Students are : [Ajay, Raj, Yash, Ayush]
Their Ranks are : [1, 2, 3, 4]
Justin has got a rank : false
There is a second rank : true
The student at topmost position is : Ajay      */


fun main()
{
  val ranks = mutableMapOf(1 to "Ajay", 2 to "Raj", 3 to "Yash", 4 to "Ayush")
  
  ranks.put(4,"Sam")
  println(ranks)
  
  ranks.remove(2)
  println(ranks)
}

/* OUTPUT 

{1=Ajay, 2=Raj, 3=Yash, 4=Sam}
{1=Ajay, 3=Yash, 4=Sam}     */


