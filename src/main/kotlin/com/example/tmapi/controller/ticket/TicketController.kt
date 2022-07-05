package com.example.tmapi.controller.ticket

import com.example.tmapi.usecase.ticket.TicketUseCase
import arrow.core.computations.either
import com.example.tmapi.domain.ticket.Ticket
import kotlinx.coroutines.flow.single
import kotlinx.coroutines.reactive.asFlow
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyValueAndAwait

@Component
class TicketController(private val usecase: TicketUseCase) {

    suspend fun getTickets(request: ServerRequest): ServerResponse =
        either<Exception, List<Ticket>> {
            usecase.findByProjectId(8).bind()
        }.fold({ ServerResponse.status(HttpStatus.BAD_REQUEST).bodyValueAndAwait(it.message!!) },
            { tickets ->
                ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                    .bodyValueAndAwait(TicketsResponse.of(tickets))
            }
        )
}
