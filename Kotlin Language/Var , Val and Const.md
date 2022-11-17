
- Var is used to declare a **mutable variable**. A mutable variable is a variable that can be changed or that can be reassigned in the course of the program.

- Val is used to declare **immutable variables**. Once a value is assigned to a variable with the val keyword, it cannot be altered or reassigned throughout the program. 
Val is similar to the **final keyword** in Java.

- Const is a keyword that is used when we want a variable value to remain constant.
   - It is only used to declare a read-only property of a class in kotlin.
   - Its value is known at compile time of the program.	
   - We cannot change the value of the variable that is declared constant. 
   - It is used at the start of the variable declaration.


## Code

```
fun main() {
   var x : Int = 5
   println("Value of x : $x ")
}

```
Updating x since its var

```
fun main() {
   var x : Int = 5
   println("Value of x : $x ")
   x += 10
   println("Value of x : $x ")
} 
```
<br>

## Val

```
fun main() {
   val x : Int = 5
   println("Value of x : $x ")
   x += 10
   println("Value of x : $x ")
} 
Error : Val cannot be reassigned
