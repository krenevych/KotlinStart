package lab7

abstract class Figure {

    abstract val dimension: Int

    abstract val volume: Double

    open fun perimeter(): Double {
        throw UnsupportedOperationException("Не можна знайти периметр 3-вимірної фігури")
    }

    open fun square(): Double {
        throw UnsupportedOperationException("Не можна знайти площу 3-вимірної фігури")
    }

    open fun squareSurface(): Double {
        throw UnsupportedOperationException("Не можна знайти площу бічної поверхні для 2-вимірної фігури")
    }

    open fun squareBase(): Double {
        throw UnsupportedOperationException("Не можна знайти площу основи для 2-вимірної фігури")
    }

    open fun height(): Double {
        throw UnsupportedOperationException("Не можна знайти висоту 2-вимірної фігури")
    }



}
