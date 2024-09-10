package lab04

import java.lang.IllegalArgumentException

fun main() {
    val t = Triangle(3.0, 4.0, 5.0)

    try {
        val t3 = Triangle(3, 4, 5)
        println(t3)
        t3.a = 23.0
        println(t3)

    } catch (e: IllegalArgumentException) {
        println("Щось не так зі сторонами трикутника")
    }



}