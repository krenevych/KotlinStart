package oop_02


fun main() {
    val p1 = Person("Andrii", "Krenevych", 18)
    val p2 = Person("Andrii", "Krenevych", 18)

    p1.innerField = 222
    p2.innerField = 22

    println("Reference eq = ${p1 === p2}" )  // === - оператор порівняння посилань
    println("Content eq   = ${p1 == p2}" )  // == - оператор порівняння вмісту

    println(p1)

    val (name, lastName, age) = p1
    println("$name, $lastName, $age")

}

