- Read Official docs [HERE](https://kotlinlang.org/docs/classes.html)


<details>
<summary><h2> Constructors  </h2></summary>

- A constructor is a special member function that is invoked when an object of the class is created primarily to initialize variables or properties. 
- A class **needs to have a constructor** and if we do not declare a constructor, then the compiler generates a default constructor.
- Kotlin has two types of constructors – 
1. Primary Constructor
2. Secondary Constructor 

- A class in Kotlin can have **at most one** primary constructor, and one or more secondary constructors.   

- The primary constructor **cannot contain** any code. Initialization code can be placed in initializer blocks prefixed with the init keyword. There can be **multiple init blocks.**

- Use **this keyword** to call the primary constructor from the secondary constructor.
