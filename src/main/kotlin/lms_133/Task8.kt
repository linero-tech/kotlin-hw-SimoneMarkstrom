package lms_133

    fun vowels(sentence: String): Int{

        var result = 0
        val letterOfVowels = mapOf('a' to 5, 'e' to 4, 'i' to 3, 'o' to 2, 'u' to 1)

        sentence.lowercase().forEach{char ->
            if(letterOfVowels.contains(char)) {
                val temp = letterOfVowels.getOrDefault(char, 0)

                result += temp
            }
        }

        return result
    }

    fun main(){
        println(vowels("i lov Ktln"))
    }

// create a map of vowels
// loop sentence, in lowercase
// count vowels in sentence
// add all values of vowles
// add to result


