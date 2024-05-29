package jp.ac.it_college.std.s23006.practice.chap2

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    println("----2.7.1----")
    val list = mutableListOf<Int>()
    for (i in 1..10) {
        if (i % 2 == 1) {
            list.add(i)
        }
    }
    val oddNumbers = list.joinToString(" ")
    println(oddNumbers)

    println("----2.7.2--2.7.5----")
    val oddNumbers2 = with(mutableListOf<Int>()) {
        for (i in 1 .. 10) {
            if (i % 2 == 1) {
                add(i)
            }
        }
        this.joinToString(" ")
    }
    println(oddNumbers2)

    println("----2.7.4----")
    val oddNumbers3 = mutableListOf<Int>().run {
        for (i in 1..10) {
            if (i % 2 == 1) {
                add(i)
            }
        }
        joinToString(" ")
    }
    println(oddNumbers3)

    println("----2.7.おまけ1----")
    randomGenerationNumber()?.run {
        println("１回目：　${this}が生成されました。")
        println("${this}の３倍は${this * 3}です。")
    }
    randomGenerationNumber()?.run {
        println("２回目：　${this}が生成されました。")
        println("${this}の３倍は${this * 3}です。")
    }
    randomGenerationNumber()?.run {
        println("３回目：　${this}が生成されました。")
        println("${this}の３倍は${this * 3}です。")
    }
    randomGenerationNumber()?.run {
        println("４回目：　${this}が生成されました。")
        println("${this}の３倍は${this * 3}です。")
    }

    println("----2.7.6----")
    val oddNumbers4 = mutableListOf<Int>().let { list ->
        for (i in 1..10) {
            if (i % 2 == 1) {
                list.add(i)
            }
        }
        list.joinToString(" ")
    }
    println(oddNumbers4)

    println("----2.7.7--2.7.8----")
    println(createUser("Takehata"))
    println(createUser(null))

    println("----2.7.11----")
    val oddNumber11 = mutableListOf<Int>().apply {
        for (i in 1..10) {
            if (i % 2 == 1) {
                add(i)
            }
        }
        joinToString(separator = " ")
    }
    println(oddNumber11)

    println("----2.7.12--2.7.14----")
    updateUser(100, "Kotlin", "Nagoya")
}



fun randomGenerationNumber(): Int? {
    return if (Random.nextBoolean()) Random.nextInt(1.. 10) else null
}
