package com.prosoft.webinar07

object DefaultArgsDemo {
    class Size(var width: Int = 1, var height: Int = 1)

    @JvmStatic
    fun main(args: Array<String>) {
        println(Size().width)                    // 1 — всё по умолчанию
        println(Size(3, 5).height)               // 5 — позиционно
        val s = Size(height = 10)                // именованный, width = 1
        println("${s.width} x ${s.height}")      // 1 x 10
    }
}
