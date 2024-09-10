package oop_01

fun fun1() {
    val n: Int = 12
    val k: Int = 6
    val s: String = "Hello0"

    fun2()

    val d: Double = 144.0
}

fun fun2() {
    val d: Double = 12.0
    println(d)
}

//fun main(args: Array<String>) {
//    val n: Int = 122
//    val d = 122
//    val d2 = 122
//    val s = "Hello0"
//
//    val length: Int = s.length
//
//    fun1()
//
//    val stringBuffer = StringBuffer()
//}

fun main() {
//    val person2 = Person("Ivan", "Ivanenko", 23)
//    println(person2)
//    person2.name = "Andrii"
//    println(person2)

    val p = PersonKotlin("Andrii", "Krenevych", 12)
    p.nickName = "Prepod"
    println(p)
    p.grewOlder()
    println(p)


}
