package com.example.tmapi.controller

import com.example.tmapi.controller.ticket.TicketController
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RequestPredicates.path
import org.springframework.web.reactive.function.server.RouterFunctions.nest
import org.springframework.web.reactive.function.server.RouterFunctions.route

@Configuration
class Router {
    @Bean
    fun route(handler: TicketController) = nest(
            path("/"),
            route(
                    GET("/tickets"), handler::getTickets)
            )
}
