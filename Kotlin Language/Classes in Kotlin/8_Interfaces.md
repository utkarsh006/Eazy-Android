- READ DOCS [HERE](https://kotlinlang.org/docs/interfaces.html)
- Interfaces are another way to achieve abstraction in Kotlin, but unlike an abstract class the members of an interface are **abstract by default.**
- The key differences between an Abstract class and interface are that :
  -  An Abstract class can have a state but an interface cannot i.e. there are no properties with backing fields in an interface and as a result, an **interface 
cannot have a constructor.**
  - Classes are used to implement inheritance whereas interfaces are used to implement behaviours, therefore a **class can extend or inherit multiple interfaces** in 
    Kotlin, but can have **only one parent class** (abstract or not).
    
<br>

```
interface Vehicle 
{
	fun start()
	fun stop()
}

class Car : Vehicle 
{
	override fun start()
	{
		println("Car started")
	}

	override fun stop()
	{
		println("Car stopped")
	}
}

fun main()
{
	val obj = Car()
	obj.start()
	obj.stop()
}

/* OUTPUT 

Car started
Car stopped    */

```
<br>

<p align="center"><img height="300" src="https://user-images.githubusercontent.com/94545831/210052960-8ec9cae4-b06e-4250-941e-00c24b2d483f.png" /></p>
<p align="center"><b>ACHA THIK HAI ! SAMJH GYA😎</b></p>
