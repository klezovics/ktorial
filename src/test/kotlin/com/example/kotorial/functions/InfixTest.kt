package com.example.kotorial.functions

import org.junit.jupiter.api.Test

class InfixTest {

    infix fun String.hasThreeLetters(c: Char): Boolean {
        return this.filter { it == c }.length >= 3
    }

    @Test
    fun `test`() {
        println("azzz" hasThreeLetters 'z' )
        println("azzz" hasThreeLetters 'b' )
    }
}