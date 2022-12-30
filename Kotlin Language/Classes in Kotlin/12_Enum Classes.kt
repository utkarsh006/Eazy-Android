// DOCS : https://www.geeksforgeeks.org/enum-classes-in-kotlin/

enum class Metal(val symbol:String)
{
    IRON("Fe"), GOLD("Au"), COPPER("Cu")
}

fun main()
{
    for(obj in Metal.values())
    {
        println("Symbol : ${obj.symbol}, Name : ${obj.name}, Ordinal : ${obj.ordinal}")
    }
    
    print(Metal.IRON)
    
}

fun print(obj:Metal)
{  println(obj.name)  }
    
      
/* OUTPUT

Symbol : Fe, Name : IRON, Ordinal : 0
Symbol : Au, Name : GOLD, Ordinal : 1
Symbol : Cu, Name : COPPER, Ordinal : 2
IRON         */      

