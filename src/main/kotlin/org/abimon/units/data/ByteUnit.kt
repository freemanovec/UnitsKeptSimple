package org.abimon.units.data

import java.text.NumberFormat

data class ByteUnit(val bytes: Double): IDataUnit {
    constructor(bytes: Long): this(bytes.toDouble())

    override fun toBytes(): ByteUnit = this
    override fun toKilobytes(): Kilobyte = Kilobyte(bytes / 1000.0)
    override fun toMegabytes(): Megabyte = Megabyte(bytes / 1000.0 / 1000.0)
    override fun toGigabytes(): Unit = TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    override fun toTerabytes(): Unit = TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    override fun toPetabytes(): Unit = TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    override fun toExabytes(): Unit = TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    override fun toString(): String = "$bytes B"
    override fun format(format: NumberFormat): String = "${format.format(bytes)} B"
}