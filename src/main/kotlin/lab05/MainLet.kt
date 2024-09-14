package lab05

var person: Person? = null

fun villain() {
    person = null
}

fun main() {
    person = Person().apply {
        name = "Ivan"
        lastName = "Ivanenko"
        age = 21
    }.also { p1 ->
        println(p1)
    }


//    println(person?.name)
//    println(person?.lastName)
//    println(person?.age)

    person?.let {
        println(it.name)
        println(it.lastName)
        println(it.age)
    }



}