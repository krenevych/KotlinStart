package lect01

fun main(args: Array<String>) {
    println("Hello World! from Kotlin")

    val age = 22
    println(age)

    println()

    /* age = 45
    println(age)
 */

    val myvalue: Long = 120L

    val a = 12
    var b = 15

    b = 123

    val c = a + b
    println(c)

    val myLong : Long = 12344L

    val intFromLong = myLong.toString()
    println(intFromLong)

    println("Сконвертоване заначення $intFromLong ${myLong + c} ")

    val arrayOf: Array<Int> = arrayOf(1, 2, 3, 4)
    println(arrayOf)

    val mutableListOf = mutableListOf(1, 2, 3)
    mutableListOf.add(12)

    println(mutableListOf)

    val mapOf = mapOf(12 to 13, 34 to 23)
    println(mapOf)

    val cond = true
    val d = if (cond) {
        println("hello")
        println("hello")
        println("hello")
        println("hello")
        12
    } else {
        1222
    }

//    val d: Int
//    if (cond) {
//        d = 12
//    } else {
//        d = 1222
//    }

}