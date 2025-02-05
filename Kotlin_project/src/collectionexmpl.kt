fun main()
{


    var list=listOf<Int>(1,54,65,45,55)  //immutable list
    for (x in list){
        println(x)
    }
    //i want to create a mutable list

  var list1= mutableListOf( 56,58,6,16,245)
    println(list1)
    list1.add(554)
    println(list1)
    println(list1.contains(56))

  var  str=  mutableListOf("A","B","C","D","E","F","G")
    println(str)
    var set1 = setOf<String>("A", "B", "C", "D", "E", "F", "G") //immutable string
    println(set1)
    str.add("gh")
    println(str)

}


