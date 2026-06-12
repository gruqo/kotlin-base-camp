package com.prosoft.webinar07

object PatientDemo {
    class Patient {
        var name: String = "Unknown"
        var age: Int = 0
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val patient = Patient()        // вызов конструктора
        patient.name = "John"          // доступ к свойству через точку
        patient.age = 30
        println("${patient.name}, ${patient.age}")  // John, 30
    }
}
