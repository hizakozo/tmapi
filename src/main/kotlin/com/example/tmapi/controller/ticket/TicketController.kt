package com.example.tmapi.controller.ticket

import com.example.tmapi.usecase.ticket.TicketUseCase
import kotlinx.coroutines.flow.single
import kotlinx.coroutines.reactive.asFlow
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.security.core.context.ReactiveSecurityContextHolder

@Component
class TicketController(private val usecase: TicketUseCase) {
    private suspend fun eventWithAuthenticateUserContext() =
            ReactiveSecurityContextHolder.getContext()
                    .asFlow()
                    .single()

    suspend fun getTickets(request: ServerRequest): ServerResponse {
        eventWithAuthenticateUserContext()
                .let {it ->
                    val

                }
    }
}
