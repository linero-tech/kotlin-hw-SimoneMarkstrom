package lms_130

import kotlin.test.assertContains

fun task11_1(guests: List<String>): Int {

    val result= guests.size



    return result
}

fun task11_2(guests: List<String>, condition: String): List<String> {

     // variable for the list
       var result = guests

      // check if it contains condition
        guests.contains(condition)



    // if it contains a condition = save to result










    return result
}
fun main() {

    // Change the condition to either "-V", "-A", or "-K" to test your code under different conditions
    val conditionOfInterest = "-V"
    val listOfAttendees = listOf(
        "Stéphanie-A",
        "Edmée-K",
        "Maëlla-V",
        "Océanne-K",
        "Géraldine-K",
        "Maëline-K",
    )

    println("The event has a total of ${task11_1(listOfAttendees)} attendees.")
    println("The attendees with condition $conditionOfInterest are ${task11_2(listOfAttendees, conditionOfInterest)}")
}
