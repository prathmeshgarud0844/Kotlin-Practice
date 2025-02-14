////
////fun main() {
////    fun isSecuritySystemActive(isDoorOpen: Boolean, isNighttime: Boolean, isMotionDetected: Boolean): Boolean {
////
////        val doorAndNightCondition = isDoorOpen && isNighttime  // Door open at night condition
////        val systemActive = doorAndNightCondition || isMotionDetected  // Security activates if door is open at night or motion is detected
////
////        println("Security System Active: $systemActive")
////        return systemActive
////    }
////}
//fun main() {
//    val command = readLine()!!  // Read the command as a string
//
//    println(command == "RUN silent")  // Print true if command is "RUN silent", otherwise false
//}


fun main() {
    // Read two large numbers as strings
    val num1 = readLine()!!
    val num2 = readLine()!!

    // Convert strings to Long
    val number1 = num1.toLong()
    val number2 = num2.toLong()

    // Calculate sum
    val sum = number1 + number2

    // Print result
    println(sum)
}






