package lms_132

fun task6(items: List<Int?>): List<Int?> {

        val result = mutableListOf<Int?>()

            items.forEachIndexed { index, items ->
                if (items != null) {
                    result += items * index
                }else{
                    result += null
                }
            }

        return result
    }
    fun main() {
        println(task6(items = listOf(1, 2, null, 4)))
    }
