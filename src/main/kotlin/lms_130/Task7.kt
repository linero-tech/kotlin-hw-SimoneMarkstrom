package lms_130

fun task7(items: List<Int>): Int {







                var result = 0

              if(items.isNotEmpty()) {

                  result = items.first()
                  items.forEach { number ->

                      if (number < result) {
                          result = number


                      }
                  }
              }



return result


    }




fun main(){
   println(task7(items= listOf()))
}
