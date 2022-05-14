package com.example.kotorial

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ScopeFunctions {

    // let, run, with, apply, also
    // Axis -> Return value, Reference type
    // RV -> objects, last value, nothing
    // RT -> it(or custom name), this

    @Test
    fun `test let`() {
        val len = "start_string".let {
            println("op:$it")
            it.length
        }

        assertEquals(12, len)
    }

    @Test
    // let -> allows to reference object as it all the time
    fun `test let with null`() {
        var l: String? = null

        l?.let {
            println("Printing $it")
        }

        l = "abc"
        l?.let { myString ->
            println("Info: $myString")
        }
    }

    @Test
    // run -> used to call methods of object
    fun `test run`() {
        var s: String? = "abc"

        val l = s?.run {
            println("Is empty: ${isEmpty()}")
            println(this.length)
            length
        }

        println("Str len is $l")
    }

    class Human(val name:String, val age:Int)
    @Test
    // with -> in scope reference class fields like inside class
    fun `test with`() {
        val h = Human("AK",31)
        with(h) {
            println("$name:$age")
        }


    }

    class Boat {
        var size: Int = 0
        var name: String = ""

        fun getData() = "Boat $size called $name"

        override fun toString(): String {
            return "Boat(${size},${name})"
        }
    }

    @Test
    // apply -> same as run, but returns the object
    fun `test apply`() {
        val b = Boat()
        println(b.apply {
            size = 10
            name = "AK-boat"
            println(getData())
        })
    }

    @Test
    // also -> same as apply, but returns the object
    fun `test also`() {
        val b = Boat()
        println(b.also {
            it.size = 10
            it.name = "AK-boat"
            println(it.getData())
        })
    }


}