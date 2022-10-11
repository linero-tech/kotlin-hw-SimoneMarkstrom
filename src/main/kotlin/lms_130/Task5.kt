package lms_130

fun task5(items: List<Int>): List<Int> {


    var result = mutableListOf<Int>()
    // get the index  and items in a list
     items.forEachIndexed { index, items ->
        // get the item * med sitt index
         result.add(items * index)
        //gör den till list


    }
    println(result)
    return result
}

fun main(){
    task5(listOf(1, 5, 11))
}