// Abstract Class
abstract class Animal {
    abstract fun makeSound() // Abstract method
    fun sleep() {
        println("Sleeping")  // Concrete method
    }
}

// Interface
interface Eater {
    fun eat()  // Abstract method
    fun digest() {
        println("Digesting")  // Default method (can be overridden)
    }
}
interface Eater1 {
    fun eat1()  // Abstract method
    fun digest1() {
        println("Digesting1")  // Default method (can be overridden)
    }
}

// Concrete class inheriting from abstract class and implementing interface
class Dog : Animal(),Eater {
    override fun makeSound() {
        println("Bark")  // Overriding abstract method from Animal
    }

    override fun eat() {
        println("Eating food")  // Implementing method from Eater interface
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound()  // Bark
    dog.sleep()      // Sleeping
    dog.eat()        // Eating food
    dog.digest()     // Digesting
}
