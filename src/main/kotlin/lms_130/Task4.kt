package lms_130

fun task4(items: List<Int>, factor: Int): List<Int> {

    var result = mutableListOf<Int>()
    // get a list

    items.forEachIndexed() { items, factor ->
        result.add(items % factor)

    }

    // if item % med factor
    // print result
    println(result)
    return result

}

 fun main(){
    task4(items= listOf(1,2,4,5,6), factor=2)
}