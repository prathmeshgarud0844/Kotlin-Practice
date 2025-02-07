fun main() {
    val number = readLine()?.toIntOrNull()

    if (number != null) {
        when {
            number < 0 -> println("negative")
            number > 0 -> println("positive")
            else -> println("zero")
        }
    } else {
        println("Invalid input")
    }
}
