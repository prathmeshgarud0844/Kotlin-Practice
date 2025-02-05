

import java.util.Scanner  // Import Scanner for user input

fun main() {
    val scanner = Scanner(System.`in`)  // Create a Scanner object

    // Taking input for two numbers
    val num1 = scanner.nextInt()  // Reads the first integer
    val num2 = scanner.nextInt()  // Reads the second integer

    // Calculating the sum
    val sum = num1 + num2

    // Printing the output in the required format
    println("$num1 plus $num2 equals $sum")
}
