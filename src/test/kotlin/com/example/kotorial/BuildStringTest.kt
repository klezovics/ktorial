package com.example.kotorial

import org.junit.jupiter.api.Test

class BuildStringTest {

    @Test
    fun `test can build string`() {
        val s = buildString {
            append("i")
            repeat(3) {
                append("a")
            }
        }

        println(s)
    }

    @Test
    fun `test can process file`() {
        val s = """
            1001: Nothing cool
            1002: Enemy is here
            1003: Enemy has left
        """.trimIndent()

        val lines = s.lines()

        buildString {

            for (line in lines) {
                appendLine("Info -> $line")
            }

        }.lines().forEach { println(it) }
    }

    @Test
    fun `test can capitalize second column`() {
        """
          id, name, age
          1, ak, 32
          2, em, 37
        """.trimIndent()
            .lines()
            .drop(1)
            .map {
                it.split(",").mapIndexed { idx, value -> if (idx != 1) value else value.toUpperCase() }
            }.forEach {
                println(it)
            }
    }

    @Test
    fun `tes can build list`() {
        val l = buildList<Int> {
            addAll(listOf(1, 2))
            add(1)
        }
        println(l)
    }
}