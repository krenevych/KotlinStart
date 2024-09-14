package lect04

var extreme_person: Person? = null

fun main() {
    extreme_person = Person("Maria", "Pisnya", 20)

    println(extreme_person!!.lastName)  // Never ever use it in commercial code!!!

}