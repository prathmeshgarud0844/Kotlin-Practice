// Necessary import statement
import java.util.*

fun main(args: Array<String>) {
    // Create a Scanner object for taking input
    val reader = Scanner(System.`in`)
//println("Enter your name: ")
    // Get user name
    val name = reader.nextLine()
    println("Enter a number: ")
    // Get number
    val num = reader.nextInt()
    println("Hello $name, you have $num new notifications.")
    // Make sure to use string templates to format your message
    // YOUR CODE GOES HERE
}
