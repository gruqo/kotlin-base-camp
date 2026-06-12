package com.prosoft.webinar07

object BookInitDemo {
    class Book(val title: String, val year: Int) {
        init {
            require(title.isNotBlank()) { "Название не может быть пустым" }
            require(year in 1450..2100) { "Год $year вне диапазона" }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val book = Book("Kotlin", 2024)     // ок
        println(book.title)
        // Book("", 2024)                   // упадёт: IllegalArgumentException
    }
}
