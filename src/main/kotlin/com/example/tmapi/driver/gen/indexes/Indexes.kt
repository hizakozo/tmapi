/*
 * This file is generated by jOOQ.
 */
package com.example.tmapi.driver.gen.indexes


import com.example.tmapi.driver.gen.tables.Auth
import com.example.tmapi.driver.gen.tables.Comment
import com.example.tmapi.driver.gen.tables.CommentImg
import com.example.tmapi.driver.gen.tables.Status
import com.example.tmapi.driver.gen.tables.Ticket
import com.example.tmapi.driver.gen.tables.TicketImg
import com.example.tmapi.driver.gen.tables.TicketStatus
import com.example.tmapi.driver.gen.tables.UserProject

import org.jooq.Index
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// INDEX definitions
// -------------------------------------------------------------------------

val COMMENT_IMG_COMMENT_ID: Index = Internal.createIndex(DSL.name("comment_id"), CommentImg.COMMENT_IMG, arrayOf(CommentImg.COMMENT_IMG.COMMENT_ID), false)
val STATUS_PROJECT_ID: Index = Internal.createIndex(DSL.name("project_id"), Status.STATUS, arrayOf(Status.STATUS.PROJECT_ID), false)
val TICKET_PROJECT_ID: Index = Internal.createIndex(DSL.name("project_id"), Ticket.TICKET, arrayOf(Ticket.TICKET.PROJECT_ID), false)
val USER_PROJECT_PROJECT_ID: Index = Internal.createIndex(DSL.name("project_id"), UserProject.USER_PROJECT, arrayOf(UserProject.USER_PROJECT.PROJECT_ID), false)
val TICKET_STATUS_STATUS_ID: Index = Internal.createIndex(DSL.name("status_id"), TicketStatus.TICKET_STATUS, arrayOf(TicketStatus.TICKET_STATUS.STATUS_ID), false)
val COMMENT_TICKET_ID: Index = Internal.createIndex(DSL.name("ticket_id"), Comment.COMMENT, arrayOf(Comment.COMMENT.TICKET_ID), false)
val TICKET_IMG_TICKET_ID: Index = Internal.createIndex(DSL.name("ticket_id"), TicketImg.TICKET_IMG, arrayOf(TicketImg.TICKET_IMG.TICKET_ID), false)
val TICKET_STATUS_TICKET_ID: Index = Internal.createIndex(DSL.name("ticket_id"), TicketStatus.TICKET_STATUS, arrayOf(TicketStatus.TICKET_STATUS.TICKET_ID), false)
val AUTH_USER_ID: Index = Internal.createIndex(DSL.name("user_id"), Auth.AUTH, arrayOf(Auth.AUTH.USER_ID), false)
val COMMENT_USER_ID: Index = Internal.createIndex(DSL.name("user_id"), Comment.COMMENT, arrayOf(Comment.COMMENT.USER_ID), false)
val USER_PROJECT_USER_ID: Index = Internal.createIndex(DSL.name("user_id"), UserProject.USER_PROJECT, arrayOf(UserProject.USER_PROJECT.USER_ID), false)
