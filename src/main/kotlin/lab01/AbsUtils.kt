package lab01

//fun abs(n: Int): Int {
//    val absX = if (n >= 0) n else -n
//    return absX
//}
//
//fun abs(x: Float): Float {
//    val absX = if (x >= 0) x else -x
//    return absX
//}
//
//fun abs(x: Double): Double {
//    val absX = if (x >= 0) x else -x
//    return absX
//}

fun abs(n: Int) = if (n >= 0) n else -n

//fun abs(n: Int): Int {
//    val absX = if (n >= 0) n else -n
//    return absX
//}


fun abs(x: Float) = if (x >= 0) x else -x
fun abs(x: Double) = if (x >= 0) x else -x


fun main(){
    val d = abs(123.0)
}

