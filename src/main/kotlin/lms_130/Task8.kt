package lms_130

fun task8(items: List<Int>): List<Int> {

    var highestThree = mutableListOf<Int>()
    val result = items.toSortedSet().toList()




    return result.takeLast(3)
}


fun main(){
    println( task8(listOf(60,9, 7,10)))
    }
