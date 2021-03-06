/*
 * This file is generated by jOOQ.
 */
package com.example.tmapi.driver.gen.tables


import com.example.tmapi.driver.gen.Tmapi
import com.example.tmapi.driver.gen.indexes.TICKET_STATUS_STATUS_ID
import com.example.tmapi.driver.gen.indexes.TICKET_STATUS_TICKET_ID
import com.example.tmapi.driver.gen.keys.KEY_TICKET_STATUS_PRIMARY
import com.example.tmapi.driver.gen.keys.TICKET_STATUS_IBFK_1
import com.example.tmapi.driver.gen.keys.TICKET_STATUS_IBFK_2
import com.example.tmapi.driver.gen.tables.records.TicketStatusRecord

import java.time.LocalDateTime

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row5
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
class TicketStatus(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, TicketStatusRecord>?,
    aliased: Table<TicketStatusRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<TicketStatusRecord>(
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
         * The reference instance of <code>tmapi.ticket_status</code>
         */
        val TICKET_STATUS = TicketStatus()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TicketStatusRecord> = TicketStatusRecord::class.java

    /**
     * The column <code>tmapi.ticket_status.ticket_status_id</code>.
     */
    val TICKET_STATUS_ID: TableField<TicketStatusRecord, Int?> = createField(DSL.name("ticket_status_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>tmapi.ticket_status.ticket_id</code>.
     */
    val TICKET_ID: TableField<TicketStatusRecord, Int?> = createField(DSL.name("ticket_id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>tmapi.ticket_status.status_id</code>.
     */
    val STATUS_ID: TableField<TicketStatusRecord, Int?> = createField(DSL.name("status_id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>tmapi.ticket_status.create_at</code>.
     */
    val CREATE_AT: TableField<TicketStatusRecord, LocalDateTime?> = createField(DSL.name("create_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>tmapi.ticket_status.update_at</code>.
     */
    val UPDATE_AT: TableField<TicketStatusRecord, LocalDateTime?> = createField(DSL.name("update_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<TicketStatusRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<TicketStatusRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>tmapi.ticket_status</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>tmapi.ticket_status</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>tmapi.ticket_status</code> table reference
     */
    constructor(): this(DSL.name("ticket_status"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, TicketStatusRecord>): this(Internal.createPathAlias(child, key), child, key, TICKET_STATUS, null)
    override fun getSchema(): Schema = Tmapi.TMAPI
    override fun getIndexes(): List<Index> = listOf(TICKET_STATUS_STATUS_ID, TICKET_STATUS_TICKET_ID)
    override fun getIdentity(): Identity<TicketStatusRecord, Int?> = super.getIdentity() as Identity<TicketStatusRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<TicketStatusRecord> = KEY_TICKET_STATUS_PRIMARY
    override fun getKeys(): List<UniqueKey<TicketStatusRecord>> = listOf(KEY_TICKET_STATUS_PRIMARY)
    override fun getReferences(): List<ForeignKey<TicketStatusRecord, *>> = listOf(TICKET_STATUS_IBFK_1, TICKET_STATUS_IBFK_2)
    fun ticket(): Ticket = Ticket(this, TICKET_STATUS_IBFK_1)
    fun status(): Status = Status(this, TICKET_STATUS_IBFK_2)
    override fun `as`(alias: String): TicketStatus = TicketStatus(DSL.name(alias), this)
    override fun `as`(alias: Name): TicketStatus = TicketStatus(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TicketStatus = TicketStatus(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TicketStatus = TicketStatus(name, null)

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row5<Int?, Int?, Int?, LocalDateTime?, LocalDateTime?> = super.fieldsRow() as Row5<Int?, Int?, Int?, LocalDateTime?, LocalDateTime?>
}
