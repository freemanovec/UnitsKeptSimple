package org.abimon.units.data

import java.text.NumberFormat

data class Megabyte(val megabytes: Double): IDataUnit {
    constructor(megabytes: Long): this(megabytes.toDouble())

    override fun toBytes(): ByteUnit = ByteUnit(megabytes * 1000 * 1000)
    override fun toKilobytes(): Kilobyte = Kilobyte(megabytes * 1000)
    override fun toMegabytes(): Megabyte = this
    override fun toGigabytes(): Unit = TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    override fun toTerabytes(): Unit = TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    override fun toPetabytes(): Unit = TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    override fun toExabytes(): Unit = TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    override fun toString(): String = "$megabytes MB"
    override fun format(format: NumberFormat): String = "${format.format(megabytes)} MB"
}