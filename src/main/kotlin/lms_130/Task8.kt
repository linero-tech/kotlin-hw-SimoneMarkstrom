package lms_130

fun task8(items: List<Int>): List<Int> {

    var sortedList = items.distinct().sorted()

    val result = if(sortedList.size < 3){
        sortedList
    }else{
        sortedList.takeLast(3)
    }




    return result
}


fun main(){
    println( task8(listOf(60,9, 7,10)))
    }
