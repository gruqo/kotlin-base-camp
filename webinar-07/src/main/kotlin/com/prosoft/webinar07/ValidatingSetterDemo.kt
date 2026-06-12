package com.prosoft.webinar07

object ValidatingSetterDemo {
    class Client {
        var age: Int = 18
            set(value) {
                field = if (value < 0) 18 else value
            }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val client = Client()
        client.age = 25
        println(client.age)      // 25
        client.age = -1
        println(client.age)      // 18 — отрицательное отклонено
    }
}
