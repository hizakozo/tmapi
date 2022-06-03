package com.example.tmapi.domain.ticket

data class Ticket(
        val ticketId: Number,
        val projectId: Number,
        val title: String,
        val explanation: String,
        val reporter: Number,
        val worker: Number
) {
    companion object {
        fun of(
                ticketId: Number,
                projectId: Number,
                title: String,
                explanation: String,
                reporter: Number,
                worker: Number
        ): Ticket =
                Ticket(
                        ticketId,
                        projectId,
                        title,
                        explanation,
                        reporter,
                        worker
                )
    }
}