package lms_132

fun task3(sentence: String?): String {

     var result = ""
    var vowels = listOf('a', 'e', 'i' ,'o','u')
    if(sentence == null){
        result += "*"
    }else{ result= sentence.replace(Regex("['a''e''i''o''u''A''E''I'O'U']"),"*")
    }
    //if the letter is null assign it to be *

    // else the letter is  a, e, i , o , u  change it to be * (make it case sensitive)




    return result.toString()
}

fun main() {
    println(task3(sentence = null))
}



/*
fun main() {
    val input = "H...H"
    val output = input.replace('.', 'B')
    println(output)  // Prints "HBBBH"
}
*/