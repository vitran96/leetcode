package tech.chris.leetcode;

// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element
// always exists in the array.
//
// n == nums.length
// 1 <= n <= 5*10^4
// -10^9 <= nums[i] <= 10^9
public class MajorityElement {
    public int majorityElement (int[] nums) {
        int counter = 0;
        int result = 0;
        for (int n : nums) {
            if (counter == 0) {
                result = n;
            }

            if (result == n) {
                counter++;
            } else {
                counter--;
            }
        }

        return result;
    }
}
