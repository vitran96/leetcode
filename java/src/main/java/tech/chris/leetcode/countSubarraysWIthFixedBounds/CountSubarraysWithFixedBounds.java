package tech.chris.leetcode.countSubarraysWIthFixedBounds;

// You are given an integer array nums and two integers minK and maxK.
// A fixed-bound subarray of nums is a subarray that satisfies the following conditions:
// * The minimum value in the subarray is equal to minK.
// * The maximum value in the subarray is equal to maxK.
// Return the number of fixed-bound subarrays.
// A subarray is a contiguous part of an array.
//
// Constraints:
// * 2<=nums.length<=105
// * 1<=nums[i],minK,maxK<=106
public interface CountSubarraysWithFixedBounds {
    long countSubarrays(int[] nums, int minK, int maxK);
}
