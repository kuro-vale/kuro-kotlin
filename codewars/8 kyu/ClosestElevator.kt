// https://www.codewars.com/kata/5c374b346a5d0f77af500a5a/kotlin

import kotlin.math.abs

fun elevator(left: Int, right: Int, call: Int): String {
    val leftDistance = abs(left - call)
    val rightDistance = abs(right - call)
    return if (leftDistance < rightDistance) {
        "left"
    } else {
        "right"
    }
}
