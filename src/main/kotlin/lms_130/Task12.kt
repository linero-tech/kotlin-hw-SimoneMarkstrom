package lms_130

fun task12_1(sells: List<Int>): String {

    val days = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val maxValue = sells.indexOf(sells.maxOrNull())
    val result = days[maxValue]

    return result


}

fun task12_2(sells: List<Int>): String {

    val days = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val minValue = sells.indexOf(sells.minOrNull())
    val result = days[minValue]

    return result

}

fun task12_3(sells: List<Int>): Int {

    val result= sells.sum()

    return result
}


fun main(){
    println(task12_1(listOf(20,100,800,768,765,90,10)))
    println(task12_2(listOf(20,100,800,768,765,90,10)))
    println(task12_3(listOf(20,100,800,768,765,90,10)))

}