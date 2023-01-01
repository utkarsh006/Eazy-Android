fun <T>printContent(content:T)
{
    println("Content is : $content")
}
    
fun main()
{
    printContent<String>("Utkarsh")
    printContent<Int>(10)
    
}
