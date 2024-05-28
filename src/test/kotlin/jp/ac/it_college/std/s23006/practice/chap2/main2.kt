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
}

fun randomGenerationNumber(): Int? {
    return if (Random.nextBoolean()) Random.nextInt(1.. 10) else null
}
