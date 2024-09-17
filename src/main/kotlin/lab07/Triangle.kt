package lab07

import lab7.Figure


//Від класу Фігура (або його нащадків) наслідуються такі класи
//•    Трикутник – визначається довжинами трьох сторін.

class Triangle(val a: Double, val b: Double, val c: Double) : Figure() {
    override val dimension = 2
    override val volume = square()
//        get() = square() // if a, b, c defined as var!!!!!!

    override fun perimeter() = a + b + c

    override fun square() = (perimeter() / 2).let { p ->
        Math.sqrt(p * (p - a) * (p - b) * (p - c))
    }
}
