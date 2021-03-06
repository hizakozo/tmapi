/*
 * This file is generated by jOOQ.
 */
package com.example.tmapi.driver.gen.tables.records


import com.example.tmapi.driver.gen.tables.Auth

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record7
import org.jooq.Row7
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
class AuthRecord() : UpdatableRecordImpl<AuthRecord>(Auth.AUTH), Record7<Int?, Int?, String?, String?, String?, LocalDateTime?, LocalDateTime?> {

    var authId: Int?
        set(value) = set(0, value)
        get() = get(0) as Int?

    var userId: Int?
        set(value) = set(1, value)
        get() = get(1) as Int?

    var loginId: String?
        set(value) = set(2, value)
        get() = get(2) as String?

    var password: String?
        set(value) = set(3, value)
        get() = get(3) as String?

    var mailAddress: String?
        set(value) = set(4, value)
        get() = get(4) as String?

    var createAt: LocalDateTime?
        set(value) = set(5, value)
        get() = get(5) as LocalDateTime?

    var updateAt: LocalDateTime?
        set(value) = set(6, value)
        get() = get(6) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row7<Int?, Int?, String?, String?, String?, LocalDateTime?, LocalDateTime?> = super.fieldsRow() as Row7<Int?, Int?, String?, String?, String?, LocalDateTime?, LocalDateTime?>
    override fun valuesRow(): Row7<Int?, Int?, String?, String?, String?, LocalDateTime?, LocalDateTime?> = super.valuesRow() as Row7<Int?, Int?, String?, String?, String?, LocalDateTime?, LocalDateTime?>
    override fun field1(): Field<Int?> = Auth.AUTH.AUTH_ID
    override fun field2(): Field<Int?> = Auth.AUTH.USER_ID
    override fun field3(): Field<String?> = Auth.AUTH.LOGIN_ID
    override fun field4(): Field<String?> = Auth.AUTH.PASSWORD
    override fun field5(): Field<String?> = Auth.AUTH.MAIL_ADDRESS
    override fun field6(): Field<LocalDateTime?> = Auth.AUTH.CREATE_AT
    override fun field7(): Field<LocalDateTime?> = Auth.AUTH.UPDATE_AT
    override fun component1(): Int? = authId
    override fun component2(): Int? = userId
    override fun component3(): String? = loginId
    override fun component4(): String? = password
    override fun component5(): String? = mailAddress
    override fun component6(): LocalDateTime? = createAt
    override fun component7(): LocalDateTime? = updateAt
    override fun value1(): Int? = authId
    override fun value2(): Int? = userId
    override fun value3(): String? = loginId
    override fun value4(): String? = password
    override fun value5(): String? = mailAddress
    override fun value6(): LocalDateTime? = createAt
    override fun value7(): LocalDateTime? = updateAt

    override fun value1(value: Int?): AuthRecord {
        authId = value
        return this
    }

    override fun value2(value: Int?): AuthRecord {
        userId = value
        return this
    }

    override fun value3(value: String?): AuthRecord {
        loginId = value
        return this
    }

    override fun value4(value: String?): AuthRecord {
        password = value
        return this
    }

    override fun value5(value: String?): AuthRecord {
        mailAddress = value
        return this
    }

    override fun value6(value: LocalDateTime?): AuthRecord {
        createAt = value
        return this
    }

    override fun value7(value: LocalDateTime?): AuthRecord {
        updateAt = value
        return this
    }

    override fun values(value1: Int?, value2: Int?, value3: String?, value4: String?, value5: String?, value6: LocalDateTime?, value7: LocalDateTime?): AuthRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        return this
    }

    /**
     * Create a detached, initialised AuthRecord
     */
    constructor(authId: Int? = null, userId: Int? = null, loginId: String? = null, password: String? = null, mailAddress: String? = null, createAt: LocalDateTime? = null, updateAt: LocalDateTime? = null): this() {
        this.authId = authId
        this.userId = userId
        this.loginId = loginId
        this.password = password
        this.mailAddress = mailAddress
        this.createAt = createAt
        this.updateAt = updateAt
    }
}
