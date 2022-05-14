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

    @Test
    fun pipelineTest() {
       doProcess(
            "bbb",
            listOf(
                {s -> s + "a"},
                {s -> s + "b"},
                CApender::append
            )
        ).run { println(this) }

        val superLongAndSuperDescriptiveName = Human("AK")
        superLongAndSuperDescriptiveName.run {
            println("Hello, ${this.name}")
            println("Bye, ${this.name}")
        }
    }

    object CApender {
        fun append(s:String) = s + "c"
    }

    fun doProcess(initial: String, operations: List<(String) -> String>): String {
        var resultSoFar = initial
        operations.forEach { resultSoFar = it(resultSoFar) }
        return resultSoFar
    }

    fun doWithPair(h1: Human, h2:Human, operation:(h1:Human, h2:Human) -> String ): String {
        println("Processing humans ...")
        return operation(h1,h2)
    }

    class Human(val name:String)
}