fun main() {
    val hasInvitation = readLine()!!.toBoolean()  // Read if the guest has an invitation
    val broughtGift = readLine()!!.toBoolean()  // Read if the guest brought a gift

    val allowedToEnter = hasInvitation && broughtGift  // Check both conditions

    println(allowedToEnter)  // Print true if both conditions are met, otherwise false
}
