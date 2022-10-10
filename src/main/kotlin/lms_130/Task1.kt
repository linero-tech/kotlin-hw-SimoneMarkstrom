package lms_130

fun task1(items: List<Int>): Int {


    var result = if (items.isEmpty()){
        0
    }else {
        val randomIndex= (0..items.lastIndex).random()
       items[randomIndex]
    }



    return result
}

fun main(){
    println(task1(listOf()))
}