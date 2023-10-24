package array_and_hash


/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version 04_group_anagrams, v 0.1 Tue 10/24/2023 5:07 PM by Houwen Lie
 *
 * 49. Group Anagrams [MEDIUM]
 * https://leetcode.com/problems/group-anagrams/
 */

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    // sorted anagrams will always return the same string, thus we can group them with sorted string as keys
    // ["eat","tea","tan","ate","nat","bat"] -> {"aet" : ["eat", "ate", "tea",... }
    // the problem is "sorting" every word in the list could be costly
    // another approach would be to map every word into Map<Char, Int> (see: isAnagram) then set them as keys
    // but with that we will use more memories. It's a trade-off

    // Here we use sorted word as unique key per group
    return mutableMapOf<String, List<String>>().apply {
        strs.forEach { word ->
            val key = word.sort()
            this[key] = this[key]?.plus(word) ?: listOf(word)
        }
    }.map { dict -> dict.value }
}

fun String.sort(): String = toCharArray().sorted().joinToString()

