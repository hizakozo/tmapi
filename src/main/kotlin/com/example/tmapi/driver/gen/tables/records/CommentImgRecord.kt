/*
 * This file is generated by jOOQ.
 */
package com.example.tmapi.driver.gen.tables.records


import com.example.tmapi.driver.gen.tables.CommentImg

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
class CommentImgRecord() : UpdatableRecordImpl<CommentImgRecord>(CommentImg.COMMENT_IMG), Record5<Int?, Int?, String?, LocalDateTime?, LocalDateTime?> {

    var commentImgId: Int?
        set(value) = set(0, value)
        get() = get(0) as Int?

    var commentId: Int?
        set(value) = set(1, value)
        get() = get(1) as Int?

    var commentImgPath: String?
        set(value) = set(2, value)
        get() = get(2) as String?

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

    override fun fieldsRow(): Row5<Int?, Int?, String?, LocalDateTime?, LocalDateTime?> = super.fieldsRow() as Row5<Int?, Int?, String?, LocalDateTime?, LocalDateTime?>
    override fun valuesRow(): Row5<Int?, Int?, String?, LocalDateTime?, LocalDateTime?> = super.valuesRow() as Row5<Int?, Int?, String?, LocalDateTime?, LocalDateTime?>
    override fun field1(): Field<Int?> = CommentImg.COMMENT_IMG.COMMENT_IMG_ID
    override fun field2(): Field<Int?> = CommentImg.COMMENT_IMG.COMMENT_ID
    override fun field3(): Field<String?> = CommentImg.COMMENT_IMG.COMMENT_IMG_PATH
    override fun field4(): Field<LocalDateTime?> = CommentImg.COMMENT_IMG.CREATE_AT
    override fun field5(): Field<LocalDateTime?> = CommentImg.COMMENT_IMG.UPDATE_AT
    override fun component1(): Int? = commentImgId
    override fun component2(): Int? = commentId
    override fun component3(): String? = commentImgPath
    override fun component4(): LocalDateTime? = createAt
    override fun component5(): LocalDateTime? = updateAt
    override fun value1(): Int? = commentImgId
    override fun value2(): Int? = commentId
    override fun value3(): String? = commentImgPath
    override fun value4(): LocalDateTime? = createAt
    override fun value5(): LocalDateTime? = updateAt

    override fun value1(value: Int?): CommentImgRecord {
        commentImgId = value
        return this
    }

    override fun value2(value: Int?): CommentImgRecord {
        commentId = value
        return this
    }

    override fun value3(value: String?): CommentImgRecord {
        commentImgPath = value
        return this
    }

    override fun value4(value: LocalDateTime?): CommentImgRecord {
        createAt = value
        return this
    }

    override fun value5(value: LocalDateTime?): CommentImgRecord {
        updateAt = value
        return this
    }

    override fun values(value1: Int?, value2: Int?, value3: String?, value4: LocalDateTime?, value5: LocalDateTime?): CommentImgRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        return this
    }

    /**
     * Create a detached, initialised CommentImgRecord
     */
    constructor(commentImgId: Int? = null, commentId: Int? = null, commentImgPath: String? = null, createAt: LocalDateTime? = null, updateAt: LocalDateTime? = null): this() {
        this.commentImgId = commentImgId
        this.commentId = commentId
        this.commentImgPath = commentImgPath
        this.createAt = createAt
        this.updateAt = updateAt
    }
}