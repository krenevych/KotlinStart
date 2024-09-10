package lab04

class Triangle  {

    var a: Double
//        set(value) {
////            if (checkEdges(value, b, c)) {
//                field = value
////            }
//        }

    var b: Double
//        set(value) {
//            if (checkEdges(a, value, c)) {
//                field = value
//            }
//        }

    var c: Double
//        set(value) {
//            if (checkEdges(a, b, value)) {
//                field = value
//            }
//        }

    constructor (
        a: Double,
        b: Double,
        c: Double,
    ) {
        if (!checkEdges(a, b, c)) throw IllegalArgumentException()

        this.a = a
        this.b = b
        this.c = c
    }

    constructor (
        a: Int,
        b: Int,
        c: Int,
    ) : this(a.toDouble(), b.toDouble(), c.toDouble()) {

    }


    val perimetr
        get() = a + b + c

    override fun toString(): String {
        return "Triangle: $a, $b, $c"
    }

    companion object { // статика

        fun checkEdges(a: Double,
                       b: Double,
                       c: Double,): Boolean {
            return (a > 0 && b > 0 && c > 0)
                    && !(a + b <= c || a + c <= b || b + c <= a)
        }
    }
}