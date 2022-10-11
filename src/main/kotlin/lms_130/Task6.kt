package lms_130

fun task6(sentence: String): String {

    // create a old string
    //create a new string

    var oldString = sentence
    var newString = ""

   var result= sentence.forEachIndexed{ index, letter ->
        newString +=if (index % 2 == 0)
           letter.toUpperCase()
        else{ letter

        }
    }
           println (newString)
            return result.toString()
   }

fun main () {
    task6(sentence= "i like Gothenburg")

}




            /*
    Oldstring. foreachindexed { index , letter - >

        Newsting += If (index % 2 == 0
                Letter.toupperCase

                Else letter

                Printlin ($newsting*/



//Var oldstring= ”sweden is a beautiful country and i like kotlin”)
//Var newsting = ””
//
//For ( index in oldstring.indices)
//
//Var letter = oldstring [index]
//
//If ( number % 2 = 0 )
//Letter = letter.touppercase
//
//Newsting = newstring + letter
//
//Printlin ($newsting)