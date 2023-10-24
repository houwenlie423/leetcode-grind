package array_and_hash


/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version 02_valid_anagram, v 0.1 Tue 10/24/2023 4:15 PM by Houwen Lie
 */

/*
    242. Valid Anagram [EASY]
    https://leetcode.com/problems/valid-anagram/
 */
fun isAnagram(s: String, t: String): Boolean {

    if (s.length != t.length) return false

    val dictS = mapWord(s)
    val dictT = mapWord(t)

    return dictS == dictT

    // Without extra memory, assuming sorting algorithm does O(n log n) time and O(1) space
    // return s.sort() == t.sort()

}

internal fun mapWord(word: String): Map<Char, Int> {
    val dict = mutableMapOf<Char, Int>()
    for (letter in word) {
        dict[letter] = dict[letter]?.plus(1) ?: 1
    }
    return dict
}

// Simplified ext to sort strings
// fun String.sort(): String = toCharArray().sorted().joinToString()
