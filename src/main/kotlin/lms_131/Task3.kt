package lms_131

fun task3(a: Map<Int, String>, b: Map<Int, String>): List<Int> {

    var result = mutableListOf<Int>()

    val myListA= a.keys.toList()
    val myListB = b.keys.toList()

     for(key in a.keys) {

         if (key in b.keys)  {

             result += key

         }
     }
    return result

}


fun main (){
    println(task3(a= mapOf(1 to "A", 2 to "B", 3 to "C"), b = mapOf(1 to "A", 2 to "B", 4 to "D")))
}





/*  val myMapA = a.keys
  val myMapB = b.keys
  */


/*  val isMapAPresentInMapB = a.keys.contains(b.keys)

*/