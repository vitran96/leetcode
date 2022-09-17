package tech.chris.leetcode;

import java.util.HashSet;
import java.util.Set;

// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
// You must implement a solution with a linear runtime complexity and use only constant extra space.
// 1 <= nums.length <= 3 * 10^4
// -3 * 10^4 <= nums[i] <= 3 * 10^4
// Each element in the array appears twice except for one element which appears only once.
public class SingleNumber {
    // TODO: need optimize
    public int singleNumber (int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            boolean added = set.add(n);
            if (!added) {
                set.remove(n);
            }
        }

        return set.stream().findFirst().get();
    }
}
