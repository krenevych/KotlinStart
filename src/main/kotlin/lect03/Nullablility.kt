package oop_02

fun main() {

    var p : Person?
     // some code

    p = Person("Максим", "Зубарєв", 21)

    // some code
    // some code
    p = null

    // some code

//    if (p != null)   // BAD APPROACH FOR MULTI-THREADING
//        println(p.name)

    println(p?.name)

//    p = Person()

    println("Finish")
}