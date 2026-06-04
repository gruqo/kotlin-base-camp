package com.prosoft.webinar05

fun max(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println(max(10, 20)) // 20
    println(max(100, 20)) // 100
}