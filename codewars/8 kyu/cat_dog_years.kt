// https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b/kotlin

fun calculateYears(years: Int): Array<Int> {
    val catYears = 15 + if (years >= 2) 9 + 4 * (years - 2) else 0
    val dogYears = 15 + if (years >= 2) 9 + 5 * (years - 2) else 0
    return arrayOf(years, catYears, dogYears)
}

fun main() {
    println(calculateYears(3))
}
