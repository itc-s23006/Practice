package jp.ac.it_college.std.s23006.practice.chap2

class AddCalculationExecutorDelegate(private val calculationExecutor: jp.ac.it_college.std.s23006.practice.chap2.CalculationExecutor) :
    jp.ac.it_college.std.s23006.practice.chap2.CalculationExecutor by calculationExecutor {
        override fun calc(num1: Int, num2: Int): Int {
            return num1 + num2
        }
    }