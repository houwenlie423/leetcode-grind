package stack

import java.util.Stack


/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version 01_valid_parentheses, v 0.1 Wed 10/25/2023 4:40 PM by Houwen Lie
 *
 *  20. Valid Parentheses [EASY]
 *  https://leetcode.com/problems/valid-parentheses/
 */
fun validParentheses(s: String): Boolean {
    val validMatches = mapOf(
        ')' to '(',
        '}' to '{',
        ']' to '[',
    )

    val stack = Stack<Char>()

    for (bracket in s) {
        // Opening bracket
        if (bracket in validMatches.values) {
            stack.push(bracket)
            continue
        }

        if (stack.isEmpty() || bracket !in validMatches.keys || stack.peek() != validMatches[bracket]) {
            return false
        }

        stack.pop()
    }

    return stack.isEmpty()
}