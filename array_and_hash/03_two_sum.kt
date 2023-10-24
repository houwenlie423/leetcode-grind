package array_and_hash


/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version 03_two_sum, v 0.1 Tue 10/24/2023 4:40 PM by Houwen Lie
 */

/*
    1. Two Sum [EASY]
    https://leetcode.com/problems/two-sum/
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    // Complement to Index dictionary
    // eg: nums = [2,7,11,15], target = 9 -> dict would be { 7: 0, 2: 1, -2: 2,}

    val dict = mutableMapOf<Int, Int>()
    for ((idx, num) in nums.withIndex()) {
        if (dict.containsKey(num)) {
            return intArrayOf(dict.getValue(num), idx)
        }
        val complement = target - num
        dict[complement] = idx
    }

    return intArrayOf()
}