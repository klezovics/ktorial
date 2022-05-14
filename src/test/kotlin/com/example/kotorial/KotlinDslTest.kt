package com.example.kotorial

import org.junit.jupiter.api.Test

class KotlinDslTest {

    @Test
    fun `test own dsl`() {
        val c = buildClient("PA") {
            age = 32
            password = "Bac"
            makeAdmin()
        }

        println(c)
    }

    inline fun buildClient(name:String = "AK", clientAction: Client.() -> Unit):Client {
        return Client(name).apply(clientAction)
    }

    data class Client(var name: String) {
        var age: Int = 0
        lateinit var password:String

        fun makeAdmin() {name = "Admin"}
    }
}