//////import java.util.Scanner   // Required for reading user input.
//////
//////fun main(args: Array<String>) {
//////    // Create a scanner object for reading user input.
//////    val scanner = Scanner(System.`in`)
//////
//////    // Read a line of input from the user.
//////    val inputString = scanner.nextLine()
//////     val reversed= inputString.reversed()
//////    println(reversed)
//////
//////    // Call your function here to reverse the inputString.
//////    // Print the reversed string.
//////}
//////
//////fun main() {
//////    // write here
//////    println("I,m learning Kotlin!\n".repeat(6))
//////
//////}
//////import java.util.Scanner
//////fun main(args: Array<String>) {
//////    .
//////    .
//////    .
//////    .
//////    val scanner = Scanner(System.`in`)
//////        .
//////        .
//////        .
//////        .
//////    val name = scanner.nextLine()
//////    print("Enter your name: ")
//////    val greeting = "Hello, $name"
//////    println(greeting)
//////}
////import java.util.Scanner
////fun main(args: Array<String>) {
////    val scanner = Scanner(System.`in`)
////    print("Enter your name: ")
////    val name = scanner.nextLine()
//////    print("Enter your name: ")
////    val greeting = "Hello, $name"
////    println(greeting)
////}
//import java.util.Scanner
//fun main() {
//    // read a floating-point number
//    val floatNumber = readln().toDouble()
//    val number1 = floatNumber.toInt()
//    println(number1)
//}
//
//    // TODO: Convert the floating-point number to an integer
//
//    // TODO: Print the converted integer
//
fun main() {
    val n: Int = readln().toIntOrNull() ?: run {
        println("Wrong Type")
        return
    }
    println(n)
}
//imp