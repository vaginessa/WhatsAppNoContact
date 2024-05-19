package dev.theolm.wwc.core.ext

/**
 * It only keeps the numbers and the plus sign.
 * @return the string without invalid characters
 */
fun String.removeInvalidCharacters(): String = replace("[^+\\d]".toRegex(), "")
