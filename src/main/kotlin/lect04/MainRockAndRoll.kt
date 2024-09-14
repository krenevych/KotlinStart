package lect04

var singer_person: Person? = null


fun sing(singer: Person?){

    val sing = singer ?: Person("ElisMock", "PresleyMock", 20)

    println("${sing.name} ${sing.lastName} sings Rock'n'Roll")
}

fun sing2(singer: Person?){
    singer ?: return

    println("${singer.name} ${singer.lastName} sings Rock'n'Roll")
}

fun sing1(singer: Person?){

//    val sing = singer ?: Person("ElisMock", "PresleyMock", 20)

    (singer?:Person("ElisMock", "PresleyMock", 20)).run {
        println("${name} ${lastName} sings Rock'n'Roll")
    }


}

fun singOnlyElvis(singer: Person?){

    singer ?: throw IllegalArgumentException("Use real singer, not null")  // if (singer == null) throw Exception ...

    println("${singer.name} ${singer.lastName} sings Rock'n'Roll")
}

fun main() {
    singer_person = Person("Elvis", "Presley", 20)

//    sing(singer_person)
    sing1(singer_person)

//    singOnlyElvis(singer_person)
}