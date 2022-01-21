package net.ahrefs.ahrefschallange.utils

object StringUtils {

    fun getWordType(word: String): Pair<String, Int> {
        return word to IdManager.AUTO_COMPLETE_TYPE_SUBJECT
    }

    fun getActiveWord(cursorPosition: Int, query: String): Triple<Int, Int, String> {
        var start = 0
        for (x in (cursorPosition - 1) downTo 0) {
            if (query.elementAt(x) == '@' || query.elementAt(x) == '#') {
                start = x
                break
            } else if (query.elementAt(x) == '"') {
                start = x + 1
                break
            }
        }
        var end = query.length
        for (x in cursorPosition until query.length) {
            if (query.elementAt(x) == '@' || query.elementAt(x) == '#' || query.elementAt(x) == '"') {
                end = x-1
                break
            }
        }
        val triple = Triple(start, end, query.subSequence(start, end).trim().toString())
        return triple
    }
}