////fun main() {
////    val dog = Dog()
////    dog.breed = "Labrador"
////    dog.colour = "Black"  // Use 'colour' from the Animal class
////    dog.bark()
////    dog.eat()
////
////    val cat = Cat()
////    cat.age = 7
////    cat.colour = "Brown"  // Use 'colour' from the Animal class
////    cat.meow()
////    cat.eat()
////}
////
////open class Patya {
////    var colour: String = ""  // Change this if you want 'color'
////
////    open fun eat() {
////        println("Eat")
////    }
////}
////
////class Dog : Patya() {
////    var breed: String = ""
////
////    fun bark() {
////        println("Bark")
////    }
////}
////
////class Cat : Patya() {
////    var age: Int = -1
////
////    fun meow() {
////        println("Meow")
////    }
////}
////fun main(args: Array<String>) {
//    val emp = employee(18018, "Sagnik")
//    // default value for emp_name will be used here
//    val emp2 = employee(11011)
//    // default values for both parameters
//    // because no arguments passed
//    val emp3 = employee()
//}
//
//class employee(emp_id : Int = 100 , emp_name: String = "abc") {
//    val id: Int
//    var name: String
//
//    // initializer block
//    init {
//        id = emp_id
//        name = emp_name
//
//        print("Employee id is: $id, ")
//        println("Employee name: $name")
//        println()
//    }
//}
