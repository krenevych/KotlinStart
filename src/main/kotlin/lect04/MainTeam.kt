package lect04

var team: Team? = null

fun main() {

//    team = Team().apply {
//        member1 = Person("Maria", "Pisnya", 20)
//        member2 = Person("Vadym", "Tunik", 21)
//        member3 = Person("Anna", "Golopura", 20)
//    }
//
//    team?.run {
//        println(member1)
//        println(member2)
//        println(member3)
//        println(member4)
//    }


    team = Team(
        Person("Maria", "Pisnya", 20),
        Person("Vadym", "Tunik", 21),
        Person("Anna", "Golopura", 20)
    )


    println(team?.member2?.lastName)


}