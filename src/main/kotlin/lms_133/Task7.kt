package lms_133
fun censorship(sentence: String): String{

  val modifiedSentence = mutableListOf<String>()

  sentence.split(" ").forEach{word ->
    modifiedSentence += if(word.length < 5){
      word
    }else{
      "".repeat(word.length)
    }
  }
  return modifiedSentence.joinToString(separator = " ")
}
fun main(){
  println(censorship("Avoid saying bad words"))
}
//Create function argument & return = String
//Loop sentence to get each word
// Is word longer than 4 letters, replace each letter with a
// Return modified sentence