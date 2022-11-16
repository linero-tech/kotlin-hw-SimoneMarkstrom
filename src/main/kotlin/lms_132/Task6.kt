package lms_132

fun task6(items: List<Int?>): List<Int?> {

        val result = mutableListOf<Int?>()

        if(items.isEmpty()){
            result += result
        }else {
            items.forEachIndexed { index, items ->
                if (items != null) {
                    result.add(items * index)
                }else{
                    result.add(items)
                }
            }
        }
        return result
    }
    fun main() {
        println(task6(items = listOf(1, 2, null, 4)))
    }
