package lect02

class Person(
    var name: String = "",
    var lastName: String = "",
    var age: Int = 0
)
{
    override fun toString(): String {
        return "Person(name='$name', lastName='$lastName', age=$age)"
    }
}