package lab01

fun main() {
    // Визначити модуль цілого числа
    var x: Int = readln().toInt()
    val absX = if (x >= 0) x else -x
    x = 12
    println("Модуль числа $x буде $absX")

}