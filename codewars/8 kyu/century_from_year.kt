// https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097/kotlin

import kotlin.math.ceil

fun century(number: Int): Int {
    return ceil(number / 100.0).toInt()
}

fun main() {
    println(century(2001))
}
