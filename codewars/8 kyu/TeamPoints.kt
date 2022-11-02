//  https://www.codewars.com/kata/5bb904724c47249b10000131/kotlin

fun main() {
    println(points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3")))
}

fun points(games: List<String>): Int {
    return games.sumOf { s -> if (s[0] > s[2]) 3 else if (s[0] == s[2]) 1 else 0 as Int } // 0 as int to avoid sumOf override bug
}
