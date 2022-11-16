package lms_132

fun task4(sentence: String?): Map<Char, Int> {

    val result = mutableMapOf('a' to 0, 'e' to 0, 'i' to 0, 'o' to 0, 'u' to 0)
    val newSentence = sentence?.toLowerCase()
    //If sentence is null = empty map
    if (newSentence.isNullOrEmpty()) {
        result.clear()
    }else{
        newSentence.forEach{letter ->
            if (letter in result.keys) {
                result[letter] = result.getOrDefault(letter, 0)+1
            }
        }
    }


    // Else count vowels in sentence
    // add vowels as key to a map and number of times they appear to value


    return result

}

fun main(){
    println(task4(sentence = "heelloo"))
}



