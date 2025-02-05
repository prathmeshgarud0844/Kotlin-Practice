
//class

 open class Person{
    open var id:Int=5643
   open fun  display()
    {
        println("id is ${id}")

    }

}
//child class
class Emp:Person()
{
     override var id:Int=852
     override fun display()
    {
        println("id is ${id}")

    }
     fun  display2()
    {
        println("demo")

    }


}
fun main(){
    var obj2=Person()
    obj2.display()
obj2.display()
    var obj1=Emp()
    obj1.display()
obj1.display2()
}