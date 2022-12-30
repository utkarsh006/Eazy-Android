open class Person
{
    fun walk()     { println("Walking")  }
    
    fun sleep()    { println("Sleeping") }
    
    open fun talk()  { println("Talking") }
}

fun main()
{
    startTalking(object:Person()
    {
        override fun talk() { println("Utkarsh is Talking") }
    })
}

fun startTalking(person:Person)
{
    person.talk()
}

// OUTPUT : Utkarsh is Talking
