package org.abimon.units.data

import java.text.NumberFormat

data class Kilobyte(val kilobytes: Double): IDataUnit {
    constructor(kilobytes: Long): this(kilobytes.toDouble())

    override fun toBytes(): ByteUnit = ByteUnit(kilobytes * 1000)
    override fun toKilobytes(): Kilobyte = this
    override fun toMegabytes(): Megabyte = Megabyte(kilobytes / 1000.0)
    override fun toGigabytes(): Unit = TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    override fun toTerabytes(): Unit = TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    override fun toPetabytes(): Unit = TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    override fun toExabytes(): Unit = TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    override fun toString(): String = "$kilobytes KB"
    override fun format(format: NumberFormat): String = "${format.format(kilobytes)} KB"
}