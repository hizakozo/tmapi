package com.example.tmapi.gateway.mock.ticket

import com.example.tmapi.domain.ticket.Ticket
import com.example.tmapi.domain.ticket.TicketGateway
import org.springframework.stereotype.Component

@Component
class TicketRepositoryMock(): TicketGateway {
    override suspend fun find(ticketId: Number): Ticket {
        return Ticket.of(1, 2, "test", "testだよ", 3, 4);
    }
}