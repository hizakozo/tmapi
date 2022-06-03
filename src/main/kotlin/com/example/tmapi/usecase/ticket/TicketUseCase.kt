package com.example.tmapi.usecase.ticket

import com.example.tmapi.domain.ticket.Ticket
import com.example.tmapi.domain.ticket.TicketGateway
import org.springframework.stereotype.Service

@Service
class TicketUseCase(private val repository: TicketGateway) {
    suspend fun find(ticketId: Number): Ticket {
        return repository.find(ticketId);
    }
}
