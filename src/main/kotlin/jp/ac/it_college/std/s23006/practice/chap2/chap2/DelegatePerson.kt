package jp.ac.it_college.std.s23006.practice.chap2

class DelegatePerson {
    var name: String by jp.ac.it_college.std.s23006.practice.chap2.DelegateWithMessage()
    var address: String by jp.ac.it_college.std.s23006.practice.chap2.DelegateWithMessage()
}