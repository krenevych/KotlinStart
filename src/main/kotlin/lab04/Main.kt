package lab04

import java.lang.IllegalArgumentException

fun main() {
    try {
        val t = Triangle(3.0, 4.0, 5.0)
        println(t)
        t.a = 23.0
        println(t)

    } catch (e: IllegalArgumentException) {
        println("Щось не так зі сторонами трикутника")
    }



}