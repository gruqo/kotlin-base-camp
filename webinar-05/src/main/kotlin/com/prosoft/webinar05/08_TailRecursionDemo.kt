package com.prosoft.webinar05

tailrec fun factorialTail(n: Int, accumulator: Long = 1L): Long =
    if (n <= 1) accumulator else factorialTail(n - 1, accumulator * n)

fun main() {
    println(factorialTail(5))   // 120
    println(factorialTail(7))   // 5040
    // factorialTail(100000)    // отработает без StackOverflowError
}