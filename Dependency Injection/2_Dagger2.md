- Dagger generates code through annotations which we put inside our classes and is useful over manual DI(Dependency Injections).

<img width="500" src="https://user-images.githubusercontent.com/94545831/209908118-1f9197d7-f0a8-49eb-8b43-cca1da9d8ada.png" />
<img width="500" src="https://user-images.githubusercontent.com/94545831/209908183-20b3a39a-be2d-412e-a95e-2962206cbe24.png" />

- We need objects for our class, so we are **Consumer.**   
  - Annotations are : ``` @Inject ```
- A class will create object for us, so it will be a **Producer.**
  - Annotations are : ``` @Module, @Provides, @Binds ```
- Both Consumers and Producers are connected through **Connectors.**
  - Annotations are : ``` @Component ```

### Components provide objects to the consumer via producers.
<p align="center"> <img width="300" src="https://user-images.githubusercontent.com/94545831/209908909-58a21d67-a044-4ca0-ba19-0c9b495b6490.png" />


