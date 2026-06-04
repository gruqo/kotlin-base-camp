package com.prosoft.webinar05

fun describeColor(color: String): String = when (color) {
    "red" -> "красный"
    "green" -> "зеленый"
    else -> "неизвестный цвет"
}

fun main() {
    println(describeColor("red")) // красный
    println(describeColor("yellow")) // неизвестный цвет
}