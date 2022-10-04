package tech.chris.leetcode;

import java.util.HashMap;
import java.util.Map;

// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element
// always exists in the array.
//
// n == nums.length
// 1 <= n <= 5*10^4
// -10^9 <= nums[i] <= 10^9
public class MajorityElement {
    public int majorityElement (int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int highestCounter = -1;
        int result = -1;
        for (int n : nums) {
            Integer currentCounter = map.get(n);
            map.put(n, currentCounter != null ? currentCounter++ : 1);

            currentCounter = map.get(n);
            if (currentCounter > highestCounter) {
                highestCounter = currentCounter;
                result = n;
            }
        }

        return result;
    }
}
