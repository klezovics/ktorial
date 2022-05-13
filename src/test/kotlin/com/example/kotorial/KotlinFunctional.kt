package com.example.kotorial

import org.junit.jupiter.api.Test

class KotlinFunctional {

    @Test
    fun functionalTest() {
        println(
            doWithPair(Human("AK"), Human("AD")) { h1, h2 -> h1.name + h2.name + " are now friends" }
        )

        println(
             doWithPair(Human("AK"), Human("AM")) {h1,h2 -> h2.name+h1.name+" are now FIGHTERS!"}
        )
    }

    fun doWithPair(h1: Human, h2:Human, operation:(h1:Human, h2:Human) -> String ): String {
        println("Processing humans ...")
        return operation(h1,h2)
    }

    class Human(val name:String)
}