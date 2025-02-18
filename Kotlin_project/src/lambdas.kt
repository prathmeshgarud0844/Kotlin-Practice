fun main() {

    val num1 = 20
    val num2 = 10
    val n = 5


    val add= { num1:Int, num2:Int -> num1 + num2 }


    println("Addition of two values ${add(num1, num2)}")

    val square: (n: Int) -> Int = { n-> n * n }
    println("square of $n is ${square(n)}")

    fun subtract(n1:Int, n2:Int):Int{
        return n1 - n2
    }
    println("Sub is ${subtract(num1,num2)}")
}
