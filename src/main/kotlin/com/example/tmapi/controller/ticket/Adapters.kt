package com.example.tmapi.controller.ticket

import com.example.tmapi.domain.ticket.Ticket

data class TicketsResponse(
    val tickets: List<TicketResponse>,
) {
    companion object {
        fun of (
            tickets: List<Ticket>
        ) : TicketsResponse =
            TicketsResponse(
                tickets.map { ticket: Ticket ->
                    TicketResponse(
                        ticket.ticketId,
                        ticket.projectId,
                        ticket.title,
                        ticket.explanation,
                        ticket.reporter,
                        ticket.worker,
                    )}
            )
    }
}

data class TicketResponse(
    val ticketId: Number,
    val projectId: Number,
    val title: String,
    val explanation: String,
    val reporter: Number,
    val worker: Number
)
