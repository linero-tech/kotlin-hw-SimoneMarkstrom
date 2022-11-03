package lms_131

fun task13(sentence: String): String {

    var result = ""

    val words = sentence.toLowerCase().split("\\W+|\\s+".toRegex())
    val counting = words.groupingBy { it }.eachCount()

    val max = counting.maxWithOrNull( Comparator {x, y -> x.value.compareTo(y.value)})
    if (max != null) {
        result = max.key

    }

    return result
}
fun main(){
    println(task13("this this THIS is still the very very same"))
}

