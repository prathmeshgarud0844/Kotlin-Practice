fun main() {

    var str1 = "hellow"
    var str2 = "prathmesh"
    var str3 = "garud"
    println(str3.add(str1, str2))

    var x=10
    var y=20
    val greaterVal= x.greaterValue(y)
    println(greaterVal)

}
    fun String.add(str1:String, str2:String):String {
        return str1 + str2+this
    }

fun Int.greaterValue(other:Int):Int{
     if(this > other)
         return this
         else
         return other


     }
