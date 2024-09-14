package lab05

fun main() {
    val person = Person()
    println(person)

//    val consolidatedData = with(person) {
    val consolidatedData = person.run {
        name = "Ivan"
        lastName = "Ivanenko"
        age = 21

        println(name)
        println(lastName)
        println(age)

        "$name, $lastName, $age"
    }

    println(consolidatedData)


}