package lms_130

fun task7(items: List<Int>): Int {

    var result = 0

    if(items.isNotEmpty()) {
        val minValue = items.minOrNull()
        val maxValue = items.maxOrNull()

        println(minValue)

    }

    return result
}

fun main(){
    task7(items= listOf(10, 5, 11))
}
