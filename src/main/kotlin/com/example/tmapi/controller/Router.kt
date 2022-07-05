package com.example.tmapi.controller

import com.example.tmapi.controller.ticket.TicketController
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RequestPredicates.path
import org.springframework.web.reactive.function.server.RouterFunctions.nest
import org.springframework.web.reactive.function.server.RouterFunctions.route
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.coRouter
import org.springframework.web.reactive.function.server.router

@Configuration
class Router {
    @Bean
    fun route(handler: TicketController) = coRouter {
        GET("/tickets", handler::getTickets)
    }

    @Bean
    fun routes() = router {
        GET("/hello") {
            ServerResponse.ok().bodyValue("hello world, ${it.queryParam("name").orElse("anonymous")}")
        }
    }
}
