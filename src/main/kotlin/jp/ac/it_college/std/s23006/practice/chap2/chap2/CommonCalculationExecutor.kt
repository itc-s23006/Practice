package jp.ac.it_college.std.s23006.practice.chap2

class CommonCalculationExecutor(override val message: String = "calc") : jp.ac.it_college.std.s23006.practice.chap2.CalculationExecutor {
    override fun calc(num1: Int, num2: Int): Int {
        throw IllegalStateException("Not Implements calc")
    }

    override fun printStartMessage() {
        println("start: $message")
    }
}