package com.example.kotorial

import org.junit.jupiter.api.Test

class DestructuringTest {

    @Test
    fun `test destructuring`() {
        val l = listOf("a","b","c")
        val (a,b,c) = l
        println(b)

        val m = mapOf("Alice" to 21, "Bob" to 32)
        for((name,age) in m) {
            println("User $name has age $age")
        }

        val (min,max) = findMinMax(listOf(1,-100,2,3,4,100,0))
        println("$min:$max")
    }

    fun findMinMax(ns: List<Int>) = Pair(ns.minOrNull()!!, ns.maxOrNull()!!)

}