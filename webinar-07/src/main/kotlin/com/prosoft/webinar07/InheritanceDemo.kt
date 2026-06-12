package com.prosoft.webinar07

object InheritanceDemo {
    open class Animal(val name: String) {
        open fun sound() = println("Какой-то звук")
    }

    class Dog(name: String) : Animal(name) {
        override fun sound() = println("Гав!")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val animal = Animal("Существо")
        animal.sound()       // Какой-то звук

        val dog = Dog("Рекс")
        dog.sound()          // Гав! — переопределённая реализация
    }
}
