/*
 * This file is generated by jOOQ.
 */
package com.example.tmapi.driver.gen.tables


import com.example.tmapi.driver.gen.Tmapi
import com.example.tmapi.driver.gen.keys.KEY_PROJECT_PRIMARY
import com.example.tmapi.driver.gen.tables.records.ProjectRecord

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
class Project(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, ProjectRecord>?,
    aliased: Table<ProjectRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<ProjectRecord>(
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
         * The reference instance of <code>tmapi.project</code>
         */
        val PROJECT = Project()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ProjectRecord> = ProjectRecord::class.java

    /**
     * The column <code>tmapi.project.project_id</code>.
     */
    val PROJECT_ID: TableField<ProjectRecord, Int?> = createField(DSL.name("project_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>tmapi.project.project_name</code>.
     */
    val PROJECT_NAME: TableField<ProjectRecord, String?> = createField(DSL.name("project_name"), SQLDataType.VARCHAR(225).nullable(false), this, "")

    /**
     * The column <code>tmapi.project.description</code>.
     */
    val DESCRIPTION: TableField<ProjectRecord, String?> = createField(DSL.name("description"), SQLDataType.VARCHAR(225), this, "")

    /**
     * The column <code>tmapi.project.project_avatar</code>.
     */
    val PROJECT_AVATAR: TableField<ProjectRecord, String?> = createField(DSL.name("project_avatar"), SQLDataType.VARCHAR(225), this, "")

    /**
     * The column <code>tmapi.project.create_at</code>.
     */
    val CREATE_AT: TableField<ProjectRecord, LocalDateTime?> = createField(DSL.name("create_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>tmapi.project.update_at</code>.
     */
    val UPDATE_AT: TableField<ProjectRecord, LocalDateTime?> = createField(DSL.name("update_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<ProjectRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<ProjectRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>tmapi.project</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>tmapi.project</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>tmapi.project</code> table reference
     */
    constructor(): this(DSL.name("project"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, ProjectRecord>): this(Internal.createPathAlias(child, key), child, key, PROJECT, null)
    override fun getSchema(): Schema = Tmapi.TMAPI
    override fun getIdentity(): Identity<ProjectRecord, Int?> = super.getIdentity() as Identity<ProjectRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<ProjectRecord> = KEY_PROJECT_PRIMARY
    override fun getKeys(): List<UniqueKey<ProjectRecord>> = listOf(KEY_PROJECT_PRIMARY)
    override fun `as`(alias: String): Project = Project(DSL.name(alias), this)
    override fun `as`(alias: Name): Project = Project(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Project = Project(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Project = Project(name, null)

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<Int?, String?, String?, String?, LocalDateTime?, LocalDateTime?> = super.fieldsRow() as Row6<Int?, String?, String?, String?, LocalDateTime?, LocalDateTime?>
}
