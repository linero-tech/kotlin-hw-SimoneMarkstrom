package lms_130

fun task9(items: List<Int>): List<Int> {


    var newList = mutableListOf<Int>()

    items.forEachIndexed { index, number ->
        if (index == 0) {
            newList.add(number*number)
        } else {
            newList.add(number*items[index-1])
        }

    }


    return newList
}

fun main() {
    println(task9(listOf(5, 2, 3, 4)))
}