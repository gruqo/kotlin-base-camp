package com.prosoft.webinar07

object CatDemo {
    class Cat(val name: String) {
        var sleeping: Boolean = false

        fun say() {
            if (sleeping) println("zzz") else println("meow")
        }

        fun wakeUp() {
            sleeping = false
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val cat = Cat("Pharaoh")
        cat.say()            // meow
        cat.sleeping = true
        cat.say()            // zzz
        cat.wakeUp()
        cat.say()            // meow
    }
}
