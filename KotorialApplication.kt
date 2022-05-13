package com.example.kotorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotorialApplication

fun main(args: Array<String>) {
    runApplication<KotorialApplication>(*args)
}
