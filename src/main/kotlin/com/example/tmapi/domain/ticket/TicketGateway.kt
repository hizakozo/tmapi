package com.example.tmapi.domain.ticket

interface TicketGateway {
    suspend fun find(ticketId: Number): Ticket;
}