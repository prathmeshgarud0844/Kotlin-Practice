import java.util.*


fun isSecuritySystemActive(isDoorOpen: Boolean, isNighttime: Boolean, isMotionDetected: Boolean): Boolean {


        val doorAndNightCondition = isDoorOpen && isNighttime
        val systemActive = doorAndNightCondition || isMotionDetected

        println("Security System Active: $systemActive")
        return systemActive
    }

    fun main(){

        val isSeruritySystemActive1=isSecuritySystemActive(isDoorOpen = true, isNighttime = true, isMotionDetected = true)
        println("Final Security Status: $isSeruritySystemActive1")

    }

//fun main() {
//    // Read two large numbers as strings
//    val num1 = readLine()!!
//    val num2 = readLine()!!
//
//    // Convert strings to Long
//    val number1 = num1.toLong()
//    val number2 = num2.toLong()
//
//    // Calculate sum
//    val sum = number1 + number2
//
//    // Print result
//    println(sum)
//}




