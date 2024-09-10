package org.example.Lab01

fun main() {

    val month = readln().toInt()
    val season = when (month) {
        12, 1, 2 -> "Winter"
        in 3..5 -> "Spring"
        in 6..8 -> "Summer"
        in 9 ..< 12 -> "Autumn"
        else -> "Unknown"
    }

//    val season = when  {
//        month == 12 || month == 1 || month == 2 -> "Winter"
//        month in 3..5 -> "Spring"
//        month in 6..8 -> "Summer"
//        month in 9 ..< 12 -> "Autumn"
//        else -> "Unknown"
//    }

    println(season)
}