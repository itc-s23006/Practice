package jp.ac.it_college.std.s23006.practice.chap2

fun main() {
    val executor = jp.ac.it_college.std.s23006.practice.chap2.AddCalculationExecutor(jp.ac.it_college.std.s23006.practice.chap2.CommonCalculationExecutor())
    executor.printStartMessage()
    println(executor.calc(8, 11))

    val executorDelegate = jp.ac.it_college.std.s23006.practice.chap2.AddCalculationExecutorDelegate(executor)
    executorDelegate.printStartMessage()
    println(executor.calc(8, 11))

    val person = jp.ac.it_college.std.s23006.practice.chap2.Person()
    person.name = "Takehata"
    person.address = "Toyko"
    println(person.name)
    println(person.address)
}