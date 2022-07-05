/*
 * This file is generated by jOOQ.
 */
package com.example.tmapi.driver.gen.tables


import com.example.tmapi.driver.gen.Tmapi
import com.example.tmapi.driver.gen.indexes.TICKET_PROJECT_ID
import com.example.tmapi.driver.gen.keys.KEY_TICKET_PRIMARY
import com.example.tmapi.driver.gen.keys.TICKET_IBFK_1
import com.example.tmapi.driver.gen.tables.records.TicketRecord

import java.time.LocalDateTime

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row8
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
class Ticket(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, TicketRecord>?,
    aliased: Table<TicketRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<TicketRecord>(
    alias,
    Tmapi.TMAPI,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>tmapi.ticket</code>
         */
        val TICKET = Ticket()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TicketRecord> = TicketRecord::class.java

    /**
     * The column <code>tmapi.ticket.ticket_id</code>.
     */
    val TICKET_ID: TableField<TicketRecord, Int?> = createField(DSL.name("ticket_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>tmapi.ticket.project_id</code>.
     */
    val PROJECT_ID: TableField<TicketRecord, Int?> = createField(DSL.name("project_id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>tmapi.ticket.title</code>.
     */
    val TITLE: TableField<TicketRecord, String?> = createField(DSL.name("title"), SQLDataType.VARCHAR(225).nullable(false), this, "")

    /**
     * The column <code>tmapi.ticket.explanation</code>.
     */
    val EXPLANATION: TableField<TicketRecord, String?> = createField(DSL.name("explanation"), SQLDataType.VARCHAR(225), this, "")

    /**
     * The column <code>tmapi.ticket.reporter</code>.
     */
    val REPORTER: TableField<TicketRecord, Int?> = createField(DSL.name("reporter"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>tmapi.ticket.worker</code>.
     */
    val WORKER: TableField<TicketRecord, Int?> = createField(DSL.name("worker"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>tmapi.ticket.create_at</code>.
     */
    val CREATE_AT: TableField<TicketRecord, LocalDateTime?> = createField(DSL.name("create_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>tmapi.ticket.update_at</code>.
     */
    val UPDATE_AT: TableField<TicketRecord, LocalDateTime?> = createField(DSL.name("update_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<TicketRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<TicketRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>tmapi.ticket</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>tmapi.ticket</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>tmapi.ticket</code> table reference
     */
    constructor(): this(DSL.name("ticket"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, TicketRecord>): this(Internal.createPathAlias(child, key), child, key, TICKET, null)
    override fun getSchema(): Schema = Tmapi.TMAPI
    override fun getIndexes(): List<Index> = listOf(TICKET_PROJECT_ID)
    override fun getIdentity(): Identity<TicketRecord, Int?> = super.getIdentity() as Identity<TicketRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<TicketRecord> = KEY_TICKET_PRIMARY
    override fun getKeys(): List<UniqueKey<TicketRecord>> = listOf(KEY_TICKET_PRIMARY)
    override fun getReferences(): List<ForeignKey<TicketRecord, *>> = listOf(TICKET_IBFK_1)
    fun project(): Project = Project(this, TICKET_IBFK_1)
    override fun `as`(alias: String): Ticket = Ticket(DSL.name(alias), this)
    override fun `as`(alias: Name): Ticket = Ticket(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Ticket = Ticket(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Ticket = Ticket(name, null)

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row8<Int?, Int?, String?, String?, Int?, Int?, LocalDateTime?, LocalDateTime?> = super.fieldsRow() as Row8<Int?, Int?, String?, String?, Int?, Int?, LocalDateTime?, LocalDateTime?>
}