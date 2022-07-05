package com.example.tmapi.usecase.ticket

import arrow.core.Either
import com.example.tmapi.domain.ticket.Ticket
import com.example.tmapi.domain.ticket.TicketGateway
import org.springframework.stereotype.Service

@Service
class TicketUseCase(private val repository: TicketGateway) {
    suspend fun findByProjectId(projectId: Int): Either<Exception, List<Ticket>> {
        return repository.findByProjectId(projectId);
    }
}
