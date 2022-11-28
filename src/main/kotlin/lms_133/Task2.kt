package lms_133

fun fizzBuzzFoo(number: Int): String{
    var result = ""
    result = if(number % 3 == 0 && number % 5 == 0){
        "FizzBuzz"
    }else if(number % 5 == 0){
        "Buzz"
    }else if(number % 3 == 0){
        "Fizz"
    }else{
        "Foo"
    }
    return result
}

fun main(){
    println(fizzBuzzFoo(9))//Fizz
    println(fizzBuzzFoo(25))//Buzz
    println(fizzBuzzFoo(15))//FizzBuzz
    println(fizzBuzzFoo(4))//Foo
}
