package jp.ac.it_college.std.s23006.practice.chap2

fun main() {
    val executor = AddCalculationExecutor(CommonCalculationExecutor())
    executor.printStartMessage()
    println(executor.calc(8, 11))

    val executorDelegate = AddCalculationExecutorDelegate(executor)
    executorDelegate.printStartMessage()
    println(executor.calc(8, 11))

    val person = Person()
    person.name = "Takehata"
    person.address = "Toyko"
    println(person.name)
    println(person.address)
}