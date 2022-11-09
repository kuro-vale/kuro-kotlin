// https://www.codewars.com/kata/5ae62fcf252e66d44d00008e/kotlin

fun expressionsMatter(a: Int, b: Int, c: Int): Int {
    return listOf(a * b * c, a + b + c, (a + b) * c, (a * (b + c))).max()
}

fun main() {
    println(expressionsMatter(5, 3, 2))
}
