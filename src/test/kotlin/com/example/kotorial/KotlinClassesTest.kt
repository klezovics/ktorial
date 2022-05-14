package com.example.kotorial

import org.junit.jupiter.api.Test

class KotlinClassesTest {

    data class Peron(val name:String, val age: Int) {
        val displayName: String
          get() = name.replaceFirstChar { it.uppercaseChar() }
    }

    @Test
    fun testGetter() {
        val p = Peron("ak", 32)
        println(p.displayName)
    }
}