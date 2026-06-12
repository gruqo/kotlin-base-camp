package com.prosoft.webinar07

object PrivateSetDemo {
    class Book(val title: String) {
        var copiesInStock: Int = 3
            private set

        fun lend(): Boolean {
            if (copiesInStock <= 0) return false
            copiesInStock--
            return true
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val book = Book("Kotlin")
        println(book.copiesInStock)   // 3 — читать можно
        book.lend()
        println(book.copiesInStock)   // 2 — изменилось через метод
        // book.copiesInStock = 100   // ошибка компиляции: setter приватный
    }
}
