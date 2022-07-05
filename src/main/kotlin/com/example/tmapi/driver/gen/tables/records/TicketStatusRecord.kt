/*
 * This file is generated by jOOQ.
 */
package com.example.tmapi.driver.gen.tables.records


import com.example.tmapi.driver.gen.tables.TicketStatus

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record5
import org.jooq.Row5
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
class TicketStatusRecord() : UpdatableRecordImpl<TicketStatusRecord>(TicketStatus.TICKET_STATUS), Record5<Int?, Int?, Int?, LocalDateTime?, LocalDateTime?> {

    var ticketStatusId: Int?
        set(value) = set(0, value)
        get() = get(0) as Int?

    var ticketId: Int?
        set(value) = set(1, value)
        get() = get(1) as Int?

    var statusId: Int?
        set(value) = set(2, value)
        get() = get(2) as Int?

    var createAt: LocalDateTime?
        set(value) = set(3, value)
        get() = get(3) as LocalDateTime?

    var updateAt: LocalDateTime?
        set(value) = set(4, value)
        get() = get(4) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row5<Int?, Int?, Int?, LocalDateTime?, LocalDateTime?> = super.fieldsRow() as Row5<Int?, Int?, Int?, LocalDateTime?, LocalDateTime?>
    override fun valuesRow(): Row5<Int?, Int?, Int?, LocalDateTime?, LocalDateTime?> = super.valuesRow() as Row5<Int?, Int?, Int?, LocalDateTime?, LocalDateTime?>
    override fun field1(): Field<Int?> = TicketStatus.TICKET_STATUS.TICKET_STATUS_ID
    override fun field2(): Field<Int?> = TicketStatus.TICKET_STATUS.TICKET_ID
    override fun field3(): Field<Int?> = TicketStatus.TICKET_STATUS.STATUS_ID
    override fun field4(): Field<LocalDateTime?> = TicketStatus.TICKET_STATUS.CREATE_AT
    override fun field5(): Field<LocalDateTime?> = TicketStatus.TICKET_STATUS.UPDATE_AT
    override fun component1(): Int? = ticketStatusId
    override fun component2(): Int? = ticketId
    override fun component3(): Int? = statusId
    override fun component4(): LocalDateTime? = createAt
    override fun component5(): LocalDateTime? = updateAt
    override fun value1(): Int? = ticketStatusId
    override fun value2(): Int? = ticketId
    override fun value3(): Int? = statusId
    override fun value4(): LocalDateTime? = createAt
    override fun value5(): LocalDateTime? = updateAt

    override fun value1(value: Int?): TicketStatusRecord {
        ticketStatusId = value
        return this
    }

    override fun value2(value: Int?): TicketStatusRecord {
        ticketId = value
        return this
    }

    override fun value3(value: Int?): TicketStatusRecord {
        statusId = value
        return this
    }

    override fun value4(value: LocalDateTime?): TicketStatusRecord {
        createAt = value
        return this
    }

    override fun value5(value: LocalDateTime?): TicketStatusRecord {
        updateAt = value
        return this
    }

    override fun values(value1: Int?, value2: Int?, value3: Int?, value4: LocalDateTime?, value5: LocalDateTime?): TicketStatusRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        return this
    }

    /**
     * Create a detached, initialised TicketStatusRecord
     */
    constructor(ticketStatusId: Int? = null, ticketId: Int? = null, statusId: Int? = null, createAt: LocalDateTime? = null, updateAt: LocalDateTime? = null): this() {
        this.ticketStatusId = ticketStatusId
        this.ticketId = ticketId
        this.statusId = statusId
        this.createAt = createAt
        this.updateAt = updateAt
    }
}
