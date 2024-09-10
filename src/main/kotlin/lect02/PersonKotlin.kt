package oop_01

class PersonKotlin(
    val name: String = "",
    val lastName: String = "",
    var age: Int = 0
) {

    var nickName : String = ""

    override fun toString(): String {
        return "PersonKotlin(name='$name', lastName='$lastName', age=$age)"
    }

    fun grewOlder() {
        age += 5
    }
}

