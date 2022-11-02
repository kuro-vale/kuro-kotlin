//  https://www.codewars.com/kata/5b853229cfde412a470000d0/kotlin

import kotlin.math.abs

fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
    return abs(dadYearsOld - sonYearsOld * 2)
}

fun main() {
    println(twiceAsOld(36, 7))
}
