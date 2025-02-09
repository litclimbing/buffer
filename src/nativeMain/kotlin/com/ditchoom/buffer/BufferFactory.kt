@file:Suppress("EXPERIMENTAL_API_USAGE")

package com.ditchoom.buffer


actual fun PlatformBuffer.Companion.allocate(
    size: UInt,
    byteOrder: ByteOrder
): PlatformBuffer = NativeBuffer(ByteArray(size.toInt()), byteOrder = byteOrder)

actual fun PlatformBuffer.Companion.wrap(array: ByteArray, byteOrder: ByteOrder): PlatformBuffer =
    NativeBuffer(array, byteOrder = byteOrder)

actual fun String.toBuffer(): PlatformBuffer = NativeBuffer(this.encodeToByteArray(), byteOrder = ByteOrder.BIG_ENDIAN)
actual fun String.utf8Length(): UInt = encodeToByteArray().size.toUInt()
