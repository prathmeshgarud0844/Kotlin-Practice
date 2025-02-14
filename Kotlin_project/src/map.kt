//import java.util.HashMap
//
//
//fun main() {
//    var map = HashMapOf()<Int, String>()
//        map.put(2, "vishal")
//        map.put(3, "wald")
//        map.put(4, "cheese")
//
//        for (key in map.keys) {
//            println(map[key])
//        }


    fun main() {
    // Create a HashMap to store intern ID as key and intern name as value
    val interns = hashMapOf(
        101 to "Alice",
        102 to "Bob",
        103 to "Charlie"
    )

    // Using forEach to iterate over the map
    interns.forEach { (id, name) ->
        println("ID: $id, Name: $name")
    }
}