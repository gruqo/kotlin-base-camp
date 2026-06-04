package com.prosoft.webinar05

fun controlMusic() = println("Музыка включена")

fun controlLight() = println("Свет включён")

fun controlDoor() = println("Дверь закрыта")

fun chooseAction(action: String) = when (action) {
    "music" -> controlMusic()
    "light" -> controlLight()
    "door"  -> controlDoor()
    else    -> println("Неизвестное действие")
}

fun main() {
    // Имитируем выбор пользователя
    chooseAction("light")
    chooseAction("door")
    chooseAction("tv")
}