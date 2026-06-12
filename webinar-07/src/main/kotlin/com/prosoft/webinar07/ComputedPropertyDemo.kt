package com.prosoft.webinar07

object ComputedPropertyDemo {
    class Client {
        var name: String = "Unknown"
        var age: Int = 18
        val info: String
            get() = "name = $name, age = $age"
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val client = Client()
        println(client.info)     // name = Unknown, age = 18
        client.name = "Lester"
        println(client.info)     // name = Lester, age = 18 — всегда актуально
    }
}
