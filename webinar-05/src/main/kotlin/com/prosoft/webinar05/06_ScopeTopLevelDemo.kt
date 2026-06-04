package com.prosoft.webinar05

val topMessage = "Я top‑level"

fun printMessage() {
    val localMessage = "Я локальная"
    println(topMessage)   // можно
    println(localMessage) // можно внутри функции
}

fun main() {
    printMessage()
    println(topMessage)   // можно
    // println(localMessage) // ошибка! локальная недоступна
}