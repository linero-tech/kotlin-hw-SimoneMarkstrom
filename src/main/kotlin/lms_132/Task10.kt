package lms_132

fun task10(items: List<String?>): Int? {

    var result: Int? = 0
    val name = "Nemo"

    if(items.isEmpty() || name !in items){
        result = null
    }else{
        items.forEach{word ->
            if (name in items) {
                result = items.indexOf(name)
            }
        }
    }

    return result
}

fun main(){
    println(task10(items = listOf("I", "cannot", "find", "him", "nEmo")))
}
