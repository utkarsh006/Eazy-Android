fun<T> printPrice(price:T)
{
    println("Price = $price")
}

fun main()
{
    printPrice<Int>(20)
    printPrice<Double>(20.5)
    printPrice<String>("Utkarsh")
}


/* OUTPUT

Price = 20
Price = 20.5
Price = Utkarsh

But, Price = Utkarsh doesn't make any sense. So, we need to put the constraints upon generics.  */


// <T:Number> is upper bound
// DEFAULT UPPER BOUND : <T:Any?>

fun<T:Number> printPrice(price:T)
{
    println("Price = $price")
}

fun main()
{
    printPrice<Int>(20)
    printPrice<Double>(20.5)
    printPrice<String>("Utkarsh")
}

// ERROR : Type argument is not within its bounds: should be subtype of 'Number'


// WANT MULTIPLE UPPER BOUNDS??  Use Where Keyword :)

fun<T> printPrice(price:T) where T:Number, T:Serializable
