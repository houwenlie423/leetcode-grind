package array_and_hash


/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version ContainsDuplicate, v 0.1 Tue 10/24/2023 3:57 PM by Houwen Lie
 */

/*
    217. Contains Duplicate
    https://leetcode.com/problems/contains-duplicate/
 */
fun containsDuplicate(nums: IntArray): Boolean {
    if (nums.isEmpty()) return false

    val unique = mutableSetOf<Int>()
    nums.forEach { num ->
        if (unique.contains(num)) return true
        unique.add(num)
    }

    return false
}