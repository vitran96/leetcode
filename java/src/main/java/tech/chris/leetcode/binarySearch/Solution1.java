package tech.chris.leetcode.binarySearch;

public class Solution1 implements BinarySearch {
    @Override
    public int search(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }

        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }
}
