package lect04

var person: Person? = Person("Andrii", "Krenevych", 18)

fun villain(){
    person = null
}

fun main() {
//    person = null

//    if (person != null)
//        println(person.name)

    println(person?.name)


}