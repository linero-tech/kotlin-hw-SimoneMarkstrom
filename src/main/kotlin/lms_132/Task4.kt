package lms_132

fun task4(sentence: String?): Map<Char, Int> {

    val result = mutableMapOf('a' to 0, 'e' to 0, 'i' to 0, 'o' to 0, 'u' to 0)

    if (sentence.isNullOrEmpty()) {
        result.clear()
    }else{
        sentence?.lowercase().forEach{letter ->
            if (letter in result.keys) {
                result[letter] = result.getOrDefault(letter, 0)+1
            }
        }
    }


    return result

}

fun main(){
    println(task4(sentence = "heelloo"))
}



