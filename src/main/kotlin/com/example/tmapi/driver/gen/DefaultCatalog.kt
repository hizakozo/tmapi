/*
 * This file is generated by jOOQ.
 */
package com.example.tmapi.driver.gen


import kotlin.collections.List

import org.jooq.Schema
import org.jooq.impl.CatalogImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
class DefaultCatalog : CatalogImpl("") {
    companion object {

        /**
         * The reference instance of <code>DEFAULT_CATALOG</code>
         */
        val DEFAULT_CATALOG = DefaultCatalog()
    }

    /**
     * The schema <code>tmapi</code>.
     */
    val TMAPI get() = Tmapi.TMAPI

    override fun getSchemas(): List<Schema> = listOf(
        Tmapi.TMAPI
    )
}
