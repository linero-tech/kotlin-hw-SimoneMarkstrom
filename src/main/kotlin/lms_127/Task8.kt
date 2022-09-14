package lms_127

import kotlin.jvm.internal.Intrinsics.Kotlin

fun task8(sentence: String, character: Char): Int {
// (sentence.count{it == character}

    val result= sentence.count{it ==character}

    println ("the number of characters is $result")

    return result

}


