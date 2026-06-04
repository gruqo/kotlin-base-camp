package com.prosoft.webinar05

fun factorial(n: Int): Long = if (n <= 1) 1L else n * factorial(n - 1)

fun main() {
    println(factorial(5)) // 120
    println(factorial(7)) // 5040
}