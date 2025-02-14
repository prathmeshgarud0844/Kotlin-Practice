//fun main() {
//    val fruits = listOf("Apple", "Banana", "Cherry")
//    for (fruit in fruits) {
//        print(fruit)
//    }
//}
fun main() {
    val x = readLine()!!.toBoolean()  // Read first boolean value
    val y = readLine()!!.toBoolean()  // Read second boolean value
    val z = readLine()!!.toBoolean()  // Read third boolean value

    val result = !(x && y) || z  // Evaluate the logical expression

    println(result)  // Print the result
}
