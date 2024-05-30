package jp.ac.it_college.std.s23006.practice.chap2

data class Num(val value: Int) {
    operator fun plus(num: jp.ac.it_college.std.s23006.practice.chap2.Num): jp.ac.it_college.std.s23006.practice.chap2.Num {
        return jp.ac.it_college.std.s23006.practice.chap2.Num(value + num.value)
    }
}
