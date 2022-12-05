package lms_133


fun counter(word: String): Boolean {
    val alphabet = ('a'..'z')
    var indexSum = 0
    word.lowercase().forEach{letter ->
        if (letter in alphabet) {
            val index = alphabet.indexOf(letter)+1
            indexSum += index
        }
    }
    return indexSum % 2 == 0
}

fun main(){
    println(counter("a a"))//2+4+8
}
// what are the word?
// in which position in the alphabet is the specific letter
//add all the positions, if total = positive number than result = true else result = false