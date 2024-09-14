package lect04

var a: Int? = null
var b: Int? = null

fun main() {

    a = 10
    b = 15

//    val c = a!! + b!!  // not good approach
//    val c = (a ?: 0) + (b ?: 0)
    // + == .plus()

    val c = a?.plus(b ?: 0)
    println("c = ${c}")


}