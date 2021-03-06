/*
 * This file is generated by jOOQ.
 */
package com.example.tmapi.driver.gen.tables.records


import com.example.tmapi.driver.gen.tables.Project

import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record6
import org.jooq.Row6
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
class ProjectRecord() : UpdatableRecordImpl<ProjectRecord>(Project.PROJECT), Record6<Int?, String?, String?, String?, LocalDateTime?, LocalDateTime?> {

    var projectId: Int?
        set(value) = set(0, value)
        get() = get(0) as Int?

    var projectName: String?
        set(value) = set(1, value)
        get() = get(1) as String?

    var description: String?
        set(value) = set(2, value)
        get() = get(2) as String?

    var projectAvatar: String?
        set(value) = set(3, value)
        get() = get(3) as String?

    var createAt: LocalDateTime?
        set(value) = set(4, value)
        get() = get(4) as LocalDateTime?

    var updateAt: LocalDateTime?
        set(value) = set(5, value)
        get() = get(5) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row6<Int?, String?, String?, String?, LocalDateTime?, LocalDateTime?> = super.fieldsRow() as Row6<Int?, String?, String?, String?, LocalDateTime?, LocalDateTime?>
    override fun valuesRow(): Row6<Int?, String?, String?, String?, LocalDateTime?, LocalDateTime?> = super.valuesRow() as Row6<Int?, String?, String?, String?, LocalDateTime?, LocalDateTime?>
    override fun field1(): Field<Int?> = Project.PROJECT.PROJECT_ID
    override fun field2(): Field<String?> = Project.PROJECT.PROJECT_NAME
    override fun field3(): Field<String?> = Project.PROJECT.DESCRIPTION
    override fun field4(): Field<String?> = Project.PROJECT.PROJECT_AVATAR
    override fun field5(): Field<LocalDateTime?> = Project.PROJECT.CREATE_AT
    override fun field6(): Field<LocalDateTime?> = Project.PROJECT.UPDATE_AT
    override fun component1(): Int? = projectId
    override fun component2(): String? = projectName
    override fun component3(): String? = description
    override fun component4(): String? = projectAvatar
    override fun component5(): LocalDateTime? = createAt
    override fun component6(): LocalDateTime? = updateAt
    override fun value1(): Int? = projectId
    override fun value2(): String? = projectName
    override fun value3(): String? = description
    override fun value4(): String? = projectAvatar
    override fun value5(): LocalDateTime? = createAt
    override fun value6(): LocalDateTime? = updateAt

    override fun value1(value: Int?): ProjectRecord {
        projectId = value
        return this
    }

    override fun value2(value: String?): ProjectRecord {
        projectName = value
        return this
    }

    override fun value3(value: String?): ProjectRecord {
        description = value
        return this
    }

    override fun value4(value: String?): ProjectRecord {
        projectAvatar = value
        return this
    }

    override fun value5(value: LocalDateTime?): ProjectRecord {
        createAt = value
        return this
    }

    override fun value6(value: LocalDateTime?): ProjectRecord {
        updateAt = value
        return this
    }

    override fun values(value1: Int?, value2: String?, value3: String?, value4: String?, value5: LocalDateTime?, value6: LocalDateTime?): ProjectRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        return this
    }

    /**
     * Create a detached, initialised ProjectRecord
     */
    constructor(projectId: Int? = null, projectName: String? = null, description: String? = null, projectAvatar: String? = null, createAt: LocalDateTime? = null, updateAt: LocalDateTime? = null): this() {
        this.projectId = projectId
        this.projectName = projectName
        this.description = description
        this.projectAvatar = projectAvatar
        this.createAt = createAt
        this.updateAt = updateAt
    }
}
