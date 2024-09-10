package lab02

//1.Написати програму для обчислення добутку двох натуральних чисел, використовуючи лише операцію додавання.
//Вказівка. Розвʼяжіть цю задачу скориставшись функціями
//forEach
//repeat
//замість використання циклу for

fun main() {
    val n = readln().toInt()
    val m = readln().toInt()
    var mult = 0
//    for (i in 1..n){
//        mult += m
//    }

//    (1..n).forEach {
//        mult += m
//    }

    repeat(n) { mult += m }

    println(mult)
}