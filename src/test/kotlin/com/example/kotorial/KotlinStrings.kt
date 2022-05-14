package com.example.kotorial

import org.junit.jupiter.api.Test

class KotlinStrings {

    @Test
    fun `test can get path and file`() {
        val p = "/home/ak/myfile.txt"
        println(p.substringBeforeLast("/"))
        println(p.substringAfterLast("/"))
    }
}