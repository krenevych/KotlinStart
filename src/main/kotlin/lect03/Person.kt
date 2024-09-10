package lect03

data class Person(
    var name: String = "",
    var lastName: String = "",
    var age: Int = 0,

) {
    var innerField: Int = 10
}
