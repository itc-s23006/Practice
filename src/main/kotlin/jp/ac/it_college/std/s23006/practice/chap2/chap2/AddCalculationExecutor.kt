package jp.ac.it_college.std.s23006.practice.chap2

class AddCalculationExecutor(private val calculationExecutor: jp.ac.it_college.std.s23006.practice.chap2.CalculationExecutor) :
    jp.ac.it_college.std.s23006.practice.chap2.CalculationExecutor {

    override val message: String
        get() = calculationExecutor.message

    override fun calc(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    override fun printStartMessage() {
        calculationExecutor.printStartMessage()
    }
}