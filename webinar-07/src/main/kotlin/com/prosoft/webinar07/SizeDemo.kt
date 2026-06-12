package com.prosoft.webinar07

object SizeDemo {
    class Size(val width: Int, val height: Int) {
        val area: Int = width * height
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val size = Size(3, 5)
        println("${size.width} x ${size.height}, площадь ${size.area}")  // 3 x 5, площадь 15
    }
}
