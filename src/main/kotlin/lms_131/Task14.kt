package lms_131

fun task14(sentence: String): Char {

    val textAsWord = sentence.lowercase().replace(Regex("[.,;]"),"").replace(" ", "")
    val letterCounterMap = mutableMapOf<Char, Int>()

  textAsWord.forEach{letter->
      letterCounterMap[letter] = letterCounterMap.getOrDefault(letter, 0) +1

  }

 return letterCounterMap.toList().sortedBy { (key, value)->value }.last().first

}

fun main(){
    println(task14(sentence = "I am it"))
}
