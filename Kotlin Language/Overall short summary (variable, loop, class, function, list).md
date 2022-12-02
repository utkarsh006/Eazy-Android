## Why learn Kotlin ?
1. Android Development (Official language of Android Dev by Google)

## Prerequisites
Any OOPS Based language learn

## Kotlin Start

### Hello World !
```
fun main() {
    println("Hello World !")
}
```

### Variables
```
fun main() {
    val amitWork = 5	
    val amit = "Amit"
    println(amitWork)
    println(amit)
}
```

```
fun main() {
    val amitWork : Int = 5	
    val amit : String = "Amit"
    println(amitWork)
    println("My name is $amit")
}
```
```
fun main() {
    val numberVal = 10
    var numberVar = 10
    // numberVal = 20 [Not Possible]
    numberVar = 20
}
```

### Operators
```
fun main() {
    // + - * / %
    var a: Int = 10
    var b: Int = 3
    
    println("a+b = ${a+b}")
    println("a-b = ${a-b}")
    println("a*b = ${a*b}")
    println("a/b = ${a/b}")
    println("a%b = ${a%b}")
}
```

### Nullable Types
```
fun main() {
    var myName: String? = null 
    println(myName)
}
```

### if-else & when
```
fun main() {
    var age = 23
    if(age==24){
        println("You can not")
    }else{
        println("You can")
    }
    
    val value:Int = if(age==23){
        10
    }else{
        20
    }
    println(value)
    
}
```

```
fun main() {
    val name = "Amit"
    when(name){
        "Anuj"->{
            println("Anuj")
        }
        "Amit"->{
            println("Amit")
        }
        else->{
            println("Kuch bhi")
        }
    }
}
```

### Arrays & Loops
```
fun main() {
    val names = arrayOf("amit","anuj","bapi")
    for(name in names){
        println(name)
    }
    names.forEach{
        println(it)
    }
}
```

### Ranges
```
fun main() {
    for(i in 0..3){
        println(i)
    }
    
    for(i in 2..8 step 2){
        println(i)
    }
    
    val x=2
    if(x in 1..5){
        println("Present")
    }
}
```

### Mutable List
```
fun main() {
    val names = mutableListOf("amit","asim","rakesh",1)
    names[0]="Kuch bhi"
    print(names[0])
    
    for(name in names){
        println(name)
    }
}
```

### Functions 
```
fun main() {
    println(add(5,3))
    println(addShort(5,3))
    greetings("Amit")
    greetings()
}
fun add(a:Int, b:Int): Int{
    return a+b
}
fun addShort(a:Int, b:Int): Int = a+b
fun greetings(greet:String = "Good Night"){
    println("Hello $greet")
}
```

### Higher Order Functions
```
fun main() {
    val output = add(4,5,{a,b ->
        print("Add\n")
        a+b
    })
    println(output)
}
fun add(a:Int, b:Int, operate: (Int,Int) -> Int):Int{
    return operate(a,b)
}
```

### Class
```
fun main() {
    val pl = Person()
}
class Person
```

```
fun main() {
    val pl = Person("Amit")
    println(pl.name)
}
class Person (_name:String){
    val name: String
    init{
      name = _name
    }
}
```
