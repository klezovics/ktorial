package com.example.kotorial

import org.junit.jupiter.api.Test

class ExtensionFunctionTest {

    fun String.countNumberOf(char: Char) = this.filter { it == char }.length

    @Test
    fun `test z count`() {
        println("zazbz".countNumberOf('a'))
        println("zazbz".countNumberOf('z'))
    }
}