package com.example.tmapi.domain.ticket

import arrow.core.Either

interface TicketGateway {
    suspend fun findByProjectId(projectId: Int): Either<Exception, List<Ticket>>;
}
