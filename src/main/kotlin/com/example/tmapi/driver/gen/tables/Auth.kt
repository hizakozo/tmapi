/*
 * This file is generated by jOOQ.
 */
package com.example.tmapi.driver.gen.tables


import com.example.tmapi.driver.gen.Tmapi
import com.example.tmapi.driver.gen.indexes.AUTH_USER_ID
import com.example.tmapi.driver.gen.keys.AUTH_IBFK_1
import com.example.tmapi.driver.gen.keys.KEY_AUTH_LOGIN_ID
import com.example.tmapi.driver.gen.keys.KEY_AUTH_PRIMARY
import com.example.tmapi.driver.gen.tables.records.AuthRecord

import java.time.LocalDateTime

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row7
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
class Auth(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, AuthRecord>?,
    aliased: Table<AuthRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<AuthRecord>(
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
         * The reference instance of <code>tmapi.auth</code>
         */
        val AUTH = Auth()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<AuthRecord> = AuthRecord::class.java

    /**
     * The column <code>tmapi.auth.auth_id</code>.
     */
    val AUTH_ID: TableField<AuthRecord, Int?> = createField(DSL.name("auth_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>tmapi.auth.user_id</code>.
     */
    val USER_ID: TableField<AuthRecord, Int?> = createField(DSL.name("user_id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>tmapi.auth.login_id</code>.
     */
    val LOGIN_ID: TableField<AuthRecord, String?> = createField(DSL.name("login_id"), SQLDataType.VARCHAR(225).nullable(false), this, "")

    /**
     * The column <code>tmapi.auth.password</code>.
     */
    val PASSWORD: TableField<AuthRecord, String?> = createField(DSL.name("password"), SQLDataType.VARCHAR(223).nullable(false), this, "")

    /**
     * The column <code>tmapi.auth.mail_address</code>.
     */
    val MAIL_ADDRESS: TableField<AuthRecord, String?> = createField(DSL.name("mail_address"), SQLDataType.VARCHAR(223).nullable(false), this, "")

    /**
     * The column <code>tmapi.auth.create_at</code>.
     */
    val CREATE_AT: TableField<AuthRecord, LocalDateTime?> = createField(DSL.name("create_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>tmapi.auth.update_at</code>.
     */
    val UPDATE_AT: TableField<AuthRecord, LocalDateTime?> = createField(DSL.name("update_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<AuthRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<AuthRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>tmapi.auth</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>tmapi.auth</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>tmapi.auth</code> table reference
     */
    constructor(): this(DSL.name("auth"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, AuthRecord>): this(Internal.createPathAlias(child, key), child, key, AUTH, null)
    override fun getSchema(): Schema = Tmapi.TMAPI
    override fun getIndexes(): List<Index> = listOf(AUTH_USER_ID)
    override fun getIdentity(): Identity<AuthRecord, Int?> = super.getIdentity() as Identity<AuthRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<AuthRecord> = KEY_AUTH_PRIMARY
    override fun getKeys(): List<UniqueKey<AuthRecord>> = listOf(KEY_AUTH_PRIMARY, KEY_AUTH_LOGIN_ID)
    override fun getReferences(): List<ForeignKey<AuthRecord, *>> = listOf(AUTH_IBFK_1)
    fun user(): User = User(this, AUTH_IBFK_1)
    override fun `as`(alias: String): Auth = Auth(DSL.name(alias), this)
    override fun `as`(alias: Name): Auth = Auth(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Auth = Auth(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Auth = Auth(name, null)

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row7<Int?, Int?, String?, String?, String?, LocalDateTime?, LocalDateTime?> = super.fieldsRow() as Row7<Int?, Int?, String?, String?, String?, LocalDateTime?, LocalDateTime?>
}
