package oop_02

open class Student(
    name: String,
    lastName: String,
    age: Int,
    var year: Int,
    var speciality : String
) : PersonBase(name, lastName, age) {

    override fun showInfo(){
        super.showInfo()
        println("$year, $speciality")
    }
//
//    override fun showFullInfo() {
//        super.showInfo()
//        println("$year, $speciality")
//    }

}

fun main() {
    val student: PersonBase
    // some code ....
    student = Student("Максим", "Зубарєв", 21, 4, "Comp Math")

    student.showInfo()
//    student.showFullInfo()
}