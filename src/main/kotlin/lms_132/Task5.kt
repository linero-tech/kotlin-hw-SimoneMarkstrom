package lms_132

fun task5(word: String?): Boolean {
    var result = true
    val newWord = word?.lowercase()
    val duplicateLetter = mutableListOf<Char>()
    // is word null or empty, result = false
    if (newWord.isNullOrEmpty()) {
        result = false
    } else {
        //go over the word
        newWord.forEach { letter ->
            //is there any duplicate letter? then false
            if (letter !in duplicateLetter){
                duplicateLetter.add(letter)
            } else {
                //is the word an isogram? then true

                result = false
            }
        }
    }


    //is there any duplicate letter? then false

    return result
}
fun main(){
    println(task5(word = "Space"))
}

