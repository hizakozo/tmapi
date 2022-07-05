/*
 * This file is generated by jOOQ.
 */
package com.example.tmapi.driver.gen.tables


import com.example.tmapi.driver.gen.Tmapi
import com.example.tmapi.driver.gen.keys.KEY_SAMPLE_NUM_UNIQUE
import com.example.tmapi.driver.gen.keys.KEY_SAMPLE_PRIMARY
import com.example.tmapi.driver.gen.tables.records.SampleRecord

import java.time.LocalDateTime

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row6
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
class Sample(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, SampleRecord>?,
    aliased: Table<SampleRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<SampleRecord>(
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
         * The reference instance of <code>tmapi.sample</code>
         */
        val SAMPLE = Sample()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<SampleRecord> = SampleRecord::class.java

    /**
     * The column <code>tmapi.sample.sample_id</code>.
     */
    val SAMPLE_ID: TableField<SampleRecord, Int?> = createField(DSL.name("sample_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>tmapi.sample.numa</code>.
     */
    val NUMA: TableField<SampleRecord, Int?> = createField(DSL.name("numa"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>tmapi.sample.numb</code>.
     */
    val NUMB: TableField<SampleRecord, Int?> = createField(DSL.name("numb"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>tmapi.sample.numc</code>.
     */
    val NUMC: TableField<SampleRecord, Int?> = createField(DSL.name("numc"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>tmapi.sample.create_at</code>.
     */
    val CREATE_AT: TableField<SampleRecord, LocalDateTime?> = createField(DSL.name("create_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>tmapi.sample.update_at</code>.
     */
    val UPDATE_AT: TableField<SampleRecord, LocalDateTime?> = createField(DSL.name("update_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<SampleRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<SampleRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>tmapi.sample</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>tmapi.sample</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>tmapi.sample</code> table reference
     */
    constructor(): this(DSL.name("sample"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, SampleRecord>): this(Internal.createPathAlias(child, key), child, key, SAMPLE, null)
    override fun getSchema(): Schema = Tmapi.TMAPI
    override fun getIdentity(): Identity<SampleRecord, Int?> = super.getIdentity() as Identity<SampleRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<SampleRecord> = KEY_SAMPLE_PRIMARY
    override fun getKeys(): List<UniqueKey<SampleRecord>> = listOf(KEY_SAMPLE_PRIMARY, KEY_SAMPLE_NUM_UNIQUE)
    override fun `as`(alias: String): Sample = Sample(DSL.name(alias), this)
    override fun `as`(alias: Name): Sample = Sample(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Sample = Sample(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Sample = Sample(name, null)

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<Int?, Int?, Int?, Int?, LocalDateTime?, LocalDateTime?> = super.fieldsRow() as Row6<Int?, Int?, Int?, Int?, LocalDateTime?, LocalDateTime?>
}