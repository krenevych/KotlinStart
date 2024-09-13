package lab04

class Triangle(a: Double,
               b: Double,
               c: Double) {

    var a: Double = a
        set(value) {
            println("set_a")
            if (checkEdges(value, b, c)) {
                field = value
            }
        }

    var b: Double = b
        set(value) {
            println("set_b")
            if (checkEdges(a, value, c)) {
                field = value
            }
        }

    var c: Double = c
        set(value) {
            println("set_c")
            if (checkEdges(a, b, value)) {
                field = value
            }
        }

    init {
        if (!checkEdges(a, b, c)) throw IllegalArgumentException()
    }

    constructor (
        a: Int,
        b: Int,
        c: Int,
    ) : this(a.toDouble(), b.toDouble(), c.toDouble())

    override fun toString(): String {
        return "Triangle(a=$a, b=$b, c=$c)"
    }

    val perimetr
        get() = a + b + c


    companion object { // статика
        fun checkEdges(a: Double,
                       b: Double,
                       c: Double,): Boolean {
            return (a > 0 && b > 0 && c > 0)
                    && !(a + b <= c || a + c <= b || b + c <= a)
        }
    }
}