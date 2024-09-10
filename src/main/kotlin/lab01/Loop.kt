package org.example.Lab01

//fun isPrime(n: Int): Boolean {
//    for (i in 2..<n) {
//        if (n % i == 0) {
//            return false
//        }
//    }
//
//    return true
//}

fun isPrime(n: Int): Boolean {
    var i = 2
    while (i < n) {
        if (n % i == 0) {
            return false
        }
        i++
    }
    return true
}

fun main() {
    println(isPrime(23))
}