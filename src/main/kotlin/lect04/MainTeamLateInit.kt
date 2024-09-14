package lect04

lateinit var myTeam: Team

fun main() {

    myTeam = Team(
        Person("Maria", "Pisnya", 20),
        Person("Vadym", "Tunik", 21),
        Person("Anna", "Golopura", 20)
    )

    println(myTeam.member2.lastName)


}