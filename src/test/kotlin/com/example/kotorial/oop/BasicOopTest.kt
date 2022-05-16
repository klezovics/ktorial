package com.example.kotorial.oop

import org.junit.jupiter.api.Test

class BasicOopTest {

    // Each class has a primary constructor
    // A primary constructor has 0 or more fields
    // Secondary constructors can be defined, but they MUST delegate to the primary
    // Fields can be defined within the primary constructor or outside of it
    // A field can be mutable (var) or immutable (val)
    // You can configure a getter and setter on a field
    // You can add initialisation blocks inside the class

    @Test
    fun `test constuctors`() {
        val m = Mutable("hello")
        println(m)

        m.str = "Bye"
        println(m)

        val i = Immutable("abc")
        println(i)

        val s = Shape(2)
        println(s)

        s.name = "circle"
        println(s)

        val s1 = Shape(mapOf("area" to 11, "name" to 777))
        println(s1)
    }

    data class Shape(val area: Int) {
        var name: String = "shape"

        constructor(data: Map<String, Int>) : this( data["area"]!! ) {
            name = data["name"].toString()
        }

        override fun toString(): String {
            return "(area=$area,name=$name)"
        }
    }

    data class Mutable(var str:String)
    data class Immutable(val str: String)
}