## Problems without Dependency Injection

Consider the following code : 

```
class Car()
{
    private val obj : Engine = Engine()
    
    fun driveCar()
    {
        obj.start()
    }
}

```

### Problems arisen are : 

- **Car class is not testable :** We need engine class ready to test the car class, bcz engine's object is defined inside the car class.
- **Code class is not extensible :** It means that the code is hard-coded, future changes can't be integrated.
- **Single responsibility :** Each class must perform one functionality. Car class must only have drive functionality but it have engine inside it.
- **Reusability :** It may happen that the car is bad but engine is working. But Here when car gets destroyed then only engine's objects will get destroyed. We can't
reuse this engine in other car.

<p align="center"><img width=400 src="https://user-images.githubusercontent.com/94545831/209906346-3968bb5b-7a91-469c-836f-353bb1e28b65.png" /></p>
<br>

The above code can be corrected as : 


```
//pass the engine's object in Car parameter so that it can be reused.

class Car(private val obj : Engine)
{
    fun driveCar()
    {
        obj.start()
    }
}

// An example of constructor injection.
// If we make some changes in class properties(inside the class) it is called as Field Injection.
```

<p align="center"><img src="https://user-images.githubusercontent.com/94545831/209906660-81f165d6-ca9f-4eda-a04d-9a6ad50c6239.png" /></p>
<br>

- If our Class needs objects to perform its computations they **will be provided by outside means (Inject) by the system, class need not to prepare them on its own.**

