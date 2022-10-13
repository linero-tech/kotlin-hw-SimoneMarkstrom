package lms_130

fun task4(items: List<Int>, factor: Int): List<Int> {



    var result = mutableListOf<Int>()

    items.forEach{number ->
        if(number % factor == 0 && number !in result) {
            result.add(number)}
    }

    return result
}

fun main(){
    println(task4(listOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 6, 7, 8, 6, 7, 9), 2, ))
}


