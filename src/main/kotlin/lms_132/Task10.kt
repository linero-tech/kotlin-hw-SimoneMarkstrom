package lms_132

fun task10(items: List<String?>): Int? {

    var result: Int? = null

        items.withIndex().forEach {(index, item) ->
            if (item == "Nemo") {
                result = index
            }
        }
    

    return result
}

fun main(){
    println(task10(items = listOf("I", "cannot", "find", "him", "nEmo")))
}
