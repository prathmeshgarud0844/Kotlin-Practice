fun main() {
    val n = readLine()!!.toInt() // Read the first input (number of values)
    var sum = 0

    repeat(n) {
        val num = readLine()!!.toInt() // Read each integer input
        sum += num // Add to sum
    }

    println(sum) // Print the total sum
}
