package lms_130

fun task3(items: List<Int>): List<Int> {

    val uniqueListOfNumbers = mutableListOf<Int>()
    val duplicateNumbers = mutableListOf<Int>()

    val result = items.forEach{ number ->
        if (number in uniqueListOfNumbers) {
            duplicateNumbers.add(number)
        } else {
            uniqueListOfNumbers.add(number)
        }

    }
    println(duplicateNumbers)
    return duplicateNumbers

}

fun main(){
task3(listOf(1,1,1,2,2,3))
}