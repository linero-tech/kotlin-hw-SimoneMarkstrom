package lms_130

fun task3(items: List<Int>): List<Int> {

    val uniqueListOfNumbers = mutableListOf<Int>()
    val duplicateNumbers = mutableListOf<Int>()


       items.forEach{ number ->
        if (number in uniqueListOfNumbers) {
            duplicateNumbers.add(number)
        } else {
            uniqueListOfNumbers.add(number)
           var result = duplicateNumbers
        }

    }
     var result= duplicateNumbers.toSet()
    return result.toList()

}

fun main(){
println(task3(listOf(1,1,2,2,3)))
}