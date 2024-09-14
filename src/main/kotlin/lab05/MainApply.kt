package lab05

//class Foo {
//
//    fun bar() {
//        val person = Person().apply {
//            name = "Ivan"
//            lastName = "Ivanenko"
//            age = 21
//
//            println(this)  // What is "this"?
//        }
//
//    }
//
//}


fun main() {
    val person = Person().apply {
        name = "Ivan"
        lastName = "Ivanenko"
        age = 21
    }.also {p1 ->
        println(p1)
    }



    with(person) {
        println(name)
        println(lastName)
        println(age)
    }


}