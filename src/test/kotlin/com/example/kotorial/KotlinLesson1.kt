package com.example.kotorial

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KotlinLesson1 {

    @Test
    fun canUseWhenToReturnDifferentValues() {
        assertEquals("One", f(1))
        assertEquals("Greeting", f("hello"))
        assertEquals("Other", f(java.lang.StringBuilder()))
    }

    @Test
    fun canUseWhenToRunCode() {
        val l = listOf("a","b","c")
        when {
            "a" in l -> println("A is here")
            "d" !in l -> println("D is not here")
        }
    }

    data class User(val name: String, val age: Int)

    @Test
    fun `test can copy object`() {
        val u = User("AK", 32)
        println(u)
        println(u.copy())
        println(u.copy(age=18))
    }

    fun f(x: Any) =
        when (x) {
            1 -> "One"
            "hello" -> "Greeting"
            else -> "Other"
        }


}