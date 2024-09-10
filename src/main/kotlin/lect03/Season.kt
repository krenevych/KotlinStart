package lect03

enum class Season constructor(
    val ukrName: String
) {


    Winter("Зима"),
    Spring("Весна"),
    Summer("Літо"),
    Autumn("Осінь");

    fun myFunc() {
        println("Зараз така пора року ${this.ukrName}")
    }
}

fun main() {

    val season: Season = Season.Summer
    println(season)
    println(season.ukrName)

    season.myFunc()

//    when (season) {
//        Season.Winter -> println("Зима!")
//        Season.Spring -> println("Весна!")
//        Season.Summer -> println("Літо!")
//        Season.Autumn -> println("Осінь!")
//    }


}