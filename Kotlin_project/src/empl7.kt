//*lambda function:
//A lambda function in Kotlin is an anonymous function (a function without a name) that can be used as a value. Lambda functions are widely used in Kotlin for functional programming, making your code concise and expressive.
//
//Syntax of Lambda Function
//
//{ parameter(s) -> body }
//
//parameter(s): Input(s) to the lambda function.
//->: Separates the parameters from the function body.
//body: The logic or actions the lambda performs.
//
//e.g.1
//val greet = { name: String -> "Hello, $name!" }
//println(greet("Kotlin")) // Output: Hello, Kotlin!
//
//e.g.2
//
//val numbers = listOf(1, 2, 3, 4)
//
//// Using 'it' instead of explicitly defining the parameter
//numbers.forEach {
//    println(it * 2) // Output: 2, 4, 6, 8
//}
////it represents the current element in the list.
//
//e.g.3
//val add = { a: Int, b: Int -> a + b }
//println(add(3, 5)) // Output: 8
//
//e.g.4
//val multiply = { a: Int, b: Int ->
//    val result = a * b
//    result // The result is returned automatically
//}
//
//println(multiply(3, 4)) // Output: 12
//
//e.g.5
//val names = listOf("John", "Alice", "Bob")
//
//// Sort using a lambda
//val sortedNames = names.sortedBy { it.length }
//println(sortedNames) // Output: [Bob, John, Alice]
