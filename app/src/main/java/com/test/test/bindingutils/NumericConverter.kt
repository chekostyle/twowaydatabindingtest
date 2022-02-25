package com.test.test.bindingutils

import androidx.databinding.InverseMethod

object NumericConverter {

    @InverseMethod("intToString")
    @JvmStatic fun stringToInt(value: String): Int { // Add static
        return if (value.isNotEmpty()) value.toInt() else 0
    }

    @JvmStatic fun intToString(value: Int): String { // Add static
        return if (value != 0) value.toString() else ""
    }
}