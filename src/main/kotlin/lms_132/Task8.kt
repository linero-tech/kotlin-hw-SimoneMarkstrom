package lms_132

fun task8(items: List<String?>): List<String> {

    val result = mutableListOf<String>()
    for(word in items){
        if (word != null) {
            if (word.length !in 0..3) {
                result += word
            }
        }
    }
    return result
}
fun main(){
    println(task8(items = listOf("Hello", "Gothenburg", null, "me", "hej", "hopp", null)))
}
