@file:Suppress("EXPERIMENTAL_API_USAGE")

package com.ditchoom.buffer

expect fun PlatformBuffer.Companion.allocate(size: UInt, byteOrder: ByteOrder = ByteOrder.BIG_ENDIAN): PlatformBuffer
expect fun PlatformBuffer.Companion.wrap(array: ByteArray, byteOrder: ByteOrder = ByteOrder.BIG_ENDIAN): PlatformBuffer
expect fun String.toBuffer(): PlatformBuffer
expect fun String.utf8Length(): UInt
