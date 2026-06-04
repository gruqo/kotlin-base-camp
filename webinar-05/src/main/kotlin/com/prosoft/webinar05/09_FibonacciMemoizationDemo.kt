package com.prosoft.webinar05

val cache = mutableMapOf<Int, Long>()

fun fibMemo(n: Int): Long = when (n) {
    0 -> 0L
    1 -> 1L
    else -> cache.getOrPut(n) { fibMemo(n - 1) + fibMemo(n - 2) }
}

fun main() {
    println(fibMemo(40)) // 102334155 – мгновенно
    // println(fibMemo(1000)) – тоже быстро, без переполнения стека
}