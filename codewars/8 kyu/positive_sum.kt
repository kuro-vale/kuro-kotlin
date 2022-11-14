// https://www.codewars.com/kata/5715eaedb436cf5606000381/kotlin

fun sum(numbers: IntArray): Int {
    return numbers.filter { i -> i > 0 }.sum()
}

fun main() {
    println(sum(intArrayOf(1,-2,3,4,5)))
}
