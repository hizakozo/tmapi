package com.example.tmapi.gateway.mock.ticket

import arrow.core.Either
import arrow.core.computations.either
import arrow.fx.coroutines.parZip
import com.example.tmapi.domain.ticket.Ticket
import com.example.tmapi.domain.ticket.TicketGateway
import com.example.tmapi.driver.TicketDbDriver
import org.springframework.stereotype.Component

@Component
class TicketRepositoryImpl(
    private val dbDriver: TicketDbDriver
) : TicketGateway {
    override suspend fun findByProjectId(projectId: Int): Either<Exception, List<Ticket>> =
        either {
            dbDriver.findByProjectId(projectId)
        }
}
