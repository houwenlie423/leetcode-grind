package two_pointers


/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version 01_valid_palindrome, v 0.1 Wed 10/25/2023 4:24 PM by Houwen Lie
 *
 *  125. Valid Palindrome [EASY]
 *  https://leetcode.com/problems/valid-palindrome/
 */

fun isPalindrome(s: String): Boolean {
    if (s.isBlank()) return true

    var (left, right) = Pair(0, s.lastIndex)
    while (left <= right) {
        if (!s[left].isLetterOrDigit()) {
            left++
            continue
        }

        if (!s[right].isLetterOrDigit()) {
            right--
            continue
        }

        if (s[left].lowercase() != s[right].lowercase()) return false

        left++
        right--
    }
    return true
}