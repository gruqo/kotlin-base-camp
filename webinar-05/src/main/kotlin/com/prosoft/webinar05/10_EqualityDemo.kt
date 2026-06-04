package com.prosoft.webinar05

class Box(var value: Int)

fun main() {
    val a = "Hi"
    val b = "Hi"
    println(a == b)   // true – одинаковое содержимое
    println(a === b)  // обычно true из-за кеширования строк, но гарантии нет

    val box1 = Box(5)
    val box2 = Box(5)
    println(box1 == box2)   // false – разные объекты, сравнение без переопределения equals
    println(box1 === box2)  // false – разные ссылки

    val box3 = box1
    println(box1 == box3)   // true – тот же объект
    println(box1 === box3)  // true – ссылка на тот же объект
}