- Read Docs [HERE](https://www.geeksforgeeks.org/kotlin-data-classes/)

- The compiler automatically derives the following functions :
  - equals()
  - hashCode()
  - toString()
  - copy()

<p align="center"><img width="300" src="https://user-images.githubusercontent.com/94545831/210092145-4e12fee6-cfb6-4be3-ad69-8aefa522f981.png" /></p>
<p align="center"><b> EK BAAR In sabki properties padlena docs se, samjha🤨 !! </b></p>
<br>

## Rules to create Data classes 

- Data classes have properties only inside the arguments of its constructor.
- The primary constructor needs to have **at least one parameter.**
- All primary constructor parameters **need to be** marked as val or var.
- Data classes cannot be abstract, open, sealed or inner.
- Data classes may only implement interfaces.



