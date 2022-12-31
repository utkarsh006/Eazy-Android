- Singleton Class in Kotlin is also called as the **Singleton Object** in Kotlin. Singleton class is a class that is defined in such a way that **only one instance of
  the class can be created and used everywhere.**
  
 - Many times we create the two different objects of the same class, but we have to remember that creating two different objects 
  also requires the allocation of two different memories for the objects. So it is better to make a single object and use it again and again. 
  
- We need to use the object keyword. The object class can have functions, properties, and the init method. The constructor method is **not allowed** in an object so we 
  can **use the init method** if some initialization is required and the object can be defined inside a class.
 
<details> <summary><b>Singleton, without using companion object</b></summary>
  
```
//declared singleton
object GameScore
{
    var score:Int=0
    private set
    
    fun addScore(points:Int)
    {
        if(points>0)
        {
            this.score += points
        }
    }
}


class Student(val name:String)
{
   
    object College
    {
        const val collegeName="GL BAJAJ"
    }
}

fun main()
{
    GameScore.addScore(20)
    
    println("Score : ${GameScore.score}")
    println("College : ${Student.College.collegeName}")
   
}

OUTPUT : 

Score : 20
College : GL BAJAJ

```
</details>

<details> <summary><b>Singleton, using companion object</b></summary>
  
```
//declared singleton
object GameScore
{
    var score:Int=0
    private set
    
    fun addScore(points:Int)
    {
        if(points>0)
        {
            this.score += points
        }
    }
}


class Student(val name:String)
{
    
    companion object 
    {
        const val collegeName="GL BAJAJ"
    }
}

fun main()
{
    GameScore.addScore(20)
    
    println("Score : ${GameScore.score}")
    println("College : ${Student.collegeName}")
    
}

Output remains the same
```
</details>

<br>

<p align="center">
<img width="400" src="https://user-images.githubusercontent.com/94545831/210127787-8c43380b-4305-40fb-a060-08c213a3670f.png" /></p>
