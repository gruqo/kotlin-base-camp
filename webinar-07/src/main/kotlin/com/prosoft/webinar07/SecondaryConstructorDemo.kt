package com.prosoft.webinar07

object SecondaryConstructorDemo {
    class Size(val width: Int, val height: Int) {
        val area: Int = width * height

        // вторичный конструктор: квадрат по одной стороне
        constructor(side: Int, label: String) : this(side, side) {
            println("Создан квадрат '$label' со стороной $side")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val rect = Size(3, 5)              // первичный конструктор
        println("Площадь: ${rect.area}")   // Площадь: 15

        val square = Size(4, "квадрат")    // вторичный → делегирует первичному
        println("Площадь: ${square.area}") // Площадь: 16
    }
}
