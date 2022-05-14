package com.example.kotorial.query

import io.zeko.db.sql.ANSIQuery
import io.zeko.db.sql.Query
import org.junit.jupiter.api.Test

class QueryBuilderTest {

    @Test
    fun test() {
        println(Query().fields("*").from("user").toSql())
        println(Query().fields("id","name","age").from("user").toSql())
        println(ANSIQuery().fields("*").from("user").toSql())
    }
}