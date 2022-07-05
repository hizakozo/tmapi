package com.example.tmapi.driver

import com.example.tmapi.domain.ticket.Ticket
import com.example.tmapi.driver.gen.tables.references.TICKET
import org.jooq.DSLContext
import org.springframework.stereotype.Component

@Component
class TicketDbDriver(private val dsl: DSLContext ) {

    fun findByProjectId(projectId: Int): List<Ticket> =
        dsl.select()
            .from(TICKET)
            .where(TICKET.PROJECT_ID.eq(projectId))
            .fetchInto(Ticket::class.java)
}
