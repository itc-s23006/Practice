package jp.ac.it_college.std.s23006.practice.chap2

data class User(val name: String)

fun createUser(name: String?): jp.ac.it_college.std.s23006.practice.chap2.User? {
    return name?.let { n -> jp.ac.it_college.std.s23006.practice.chap2.User(n) }
}
