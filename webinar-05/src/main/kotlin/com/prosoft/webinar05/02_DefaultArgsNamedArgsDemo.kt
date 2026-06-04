package com.prosoft.webinar05

fun printLine(line: String = "", end: String = "\n") = print("$line$end")

fun main() {
    printLine("Hello", "!!!")
    printLine("Hello")
    printLine()

    printLine(end = "???", line = "Wow") // Wow???

}