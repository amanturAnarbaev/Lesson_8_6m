package com.example.lesson_8_6m

//Single Responsibility Principle
//SUUPER CLASS
open class Animal() {

    open fun makeVoice(): String {
        return ""
    }

    open fun legCount():Int{
        return 0
    }
}


class AnimalDB() {
    fun saveAnimal(animal: Animal) {

    }

    fun getAnimal(): Animal {
        return Animal()
    }

}
//POD-CLASSES
class Lion() : Animal() {
    override fun makeVoice(): String {
        return "roar"
    }



}

class Mouse() : Animal() {
    override fun makeVoice(): String {
        return "squeeeek"
    }
    override fun legCount(): Int {
        return 4
    }

}