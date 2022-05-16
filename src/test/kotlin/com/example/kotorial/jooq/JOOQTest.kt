package com.example.kotorial.jooq

import org.jooq.DSLContext
import org.jooq.Record
import org.jooq.SQLDialect
import org.jooq.SelectSelectStep
import org.jooq.conf.ParamType
import org.jooq.impl.DSL
import org.jooq.impl.DSL.*
import org.junit.jupiter.api.Test
import java.net.http.WebSocketHandshakeException

class JOOQTest {


    @Test
    fun testJooq() {
        val create = DSL.using(SQLDialect.MYSQL)

        val r = create.select(
            field("id"),
            field("title"),
        ).from(table("books"))
            .join("").on()
            .where(field("id").le(10))
        .let {
            println(it.getSQL(ParamType.INLINED))
            it
        }
    }

    enum class Layer {
        SELECT, FROM, WHERE
    }


}