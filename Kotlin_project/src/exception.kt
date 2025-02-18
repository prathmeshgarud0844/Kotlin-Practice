import java.util.*

fun main() {


    println("Hello World")
    var ob = Scanner(System.`in`)
    try {
        var ob1 = ob.nextInt()
        var ob2 = ob.nextInt()
        var n = ob1 +ob2
        println(n)
    } catch (e: ArithmeticException) {
        println("error occured ${e.message}")

   // } catch (e: Exception) {
    //println("error occured ${e.message}")
}
    finally{
        println("finally")
    }
}