package com.prosoft.webinar07

object VisibilityDemo {
    class Student(val name: String, private val id: Int) {
        fun printInfo() = println("Name: $name")   // публичный метод
        private fun getId() = id                    // внутренний помощник
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val student = Student("Mark", 1)
        println(student.name)        // ок — публичное
        student.printInfo()          // ок — публичный метод
        // println(student.id)       // ошибка: id приватный
        // student.getId()           // ошибка: метод приватный
    }
}
