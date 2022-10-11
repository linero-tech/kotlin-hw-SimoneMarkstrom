package lms_130

fun task3(items: List<Int>): List<Int> {

    // change list to a set
   val result = items.toSet()

  println(result)

    return result.toList()
}

fun main(){
    task3(listOf(5, 6, 5, 6, 7, 8, 7))
}