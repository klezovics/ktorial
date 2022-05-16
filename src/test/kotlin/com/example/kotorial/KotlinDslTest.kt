package com.example.kotorial

import org.junit.jupiter.api.Test
import java.awt.Robot

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

    inline fun buildClient(name: String = "AK", clientAction: Client.() -> Unit): Client {
        return Client(name).apply(clientAction)
    }

    data class Client(var name: String) {
        var age: Int = 0
        lateinit var password: String

        fun makeAdmin() {
            name = "Admin"
        }
    }

    @Test
    fun `test robot build`() {
        buildRobot {
            head = BattleRobotHead()
            body = BattleRobotBody()
        }.also {
            println(it)
        }
    }

    fun buildRobot(ops: RobotBuilder.() -> Unit): Robot {
        val rb =  RobotBuilder().apply(ops)
        val rob = rb.build()
        return rob
    }

    data class Robot(val head: RobotHead, val body: RobotBody)
    class RobotBuilder {
        var head: RobotHead? = null
        var body: RobotBody? = null

        fun build() = Robot(
            head = head!!,
            body = body!!
        )
    }

    interface RobotHead
    class BattleRobotHead : RobotHead
    class SupportRobotHead : RobotHead

    interface RobotBody
    class BattleRobotBody : RobotBody
    class SupportRobotBody : RobotBody

}