package com.example.kotorial

fun main() {

    val i = listOf("apple", "banana", "peach")
    when {
        "vodka" !in i -> println("Oh, no")
        "banana" in i -> println("Yummy")
    }

    i.forEach {
        println("Processing $it")
    }
}

fun f(obj: Any) =
    when (obj) {
        1 -> "One"
        "AK" -> "AK name"
        else -> "Other"
    }


