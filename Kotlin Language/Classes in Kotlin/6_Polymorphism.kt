open class Vehicle
{
    open fun startEngine()
    {
        println("Engine won't be started, lol")
    }
}

class Fortuner() : Vehicle()
{
    override fun startEngine()
    {
        println("Fortuner here")
        super.startEngine()
    }
}

class Innova() : Vehicle()
{
    override fun startEngine()
    {
        println("Innova here")
        super.startEngine()
    }
}

fun main()
{
    val fortuner: Fortuner = Fortuner()
    startFortuner(fortuner)
    
    val innova: Innova = Innova()
    startInnova(innova)
}

fun startFortuner(car: Fortuner)
{
    car.startEngine()
}

fun startInnova(car : Innova)
{
    car.startEngine()
}

/* OUTPUT

Fortuner here
Engine won't be started, lol
Innova here
Engine won't be started, lol         */


// Since, Parent class object can hold object of subclass, The above code can be reduced as : 


fun main()
{
    val fortuner: Vehicle = Fortuner()
    startCar(fortuner)
    
    val innova: Vehicle = Innova()
    startCar(innova)
}

fun startCar(car:Vehicle)
{
    car.startEngine()
}

// An object behaving differently for the same class, so this is what Polymorphism is all about.
