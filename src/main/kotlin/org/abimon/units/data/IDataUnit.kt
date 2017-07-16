package org.abimon.units.data

import java.text.NumberFormat

interface IDataUnit {
    fun toBytes(): ByteUnit
    fun toKilobytes(): Kilobyte
    fun toMegabytes(): Megabyte
    fun toGigabytes()
    fun toTerabytes()
    fun toPetabytes()
    fun toExabytes()

    override fun toString(): String
    fun format(format: NumberFormat): String
}