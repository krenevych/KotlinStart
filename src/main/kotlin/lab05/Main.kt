package lab05

fun main() {
    val person = Person()
    println(person)

//    val name: String = "Andrii"

    val consolidatedData = with(person) {
      name = "Ivan"
//        this.name = name
        lastName = "Ivanenko"
        age = 21

        println(name)
        println(lastName)
        println(age)

        "$name, $lastName, $age"
    }

    println(consolidatedData)


    val c = run {
        println(person.name)
        println(person.lastName)
        println(person.age)

        "${person.name}, ${person.lastName}, ${person.age}"
    }

    println("Hello $c")
}