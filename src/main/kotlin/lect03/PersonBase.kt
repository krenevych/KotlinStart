package lect03

open class PersonBase(
    private var name: String = "",
    private var lastName: String = "",
    private var age: Int = 0
)
{
    open fun showInfo(){
        println("From PersonBase")
        println("$name, $lastName")
    }

//    abstract fun showFullInfo()
}

fun main() {
//    val p2 = PersonBase("Максим", "Зубарєв", 21)
//    p2.showInfo()
}
