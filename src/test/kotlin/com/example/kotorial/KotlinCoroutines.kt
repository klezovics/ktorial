package com.example.kotorial

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield
import org.junit.jupiter.api.Test

class KotlinCoroutines {

    @Test
    fun testCoroutines() {
        println(doParallel())
    }

    fun doParallel() = runBlocking {
        println("Start")
        val list = listOf(10,20,30)

        val resMap = mutableMapOf<Int,Int>()
        list.forEachIndexed { idx,it ->
            launch {
                var sum=0
                for(ii in 0..it)  {
                    println("$idx: $ii")
                    sum+=ii
                }
                resMap.put(idx,sum)
            }
        }

        println("End")
        resMap
    }
}
