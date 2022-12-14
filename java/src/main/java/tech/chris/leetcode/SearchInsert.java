package tech.chris.leetcode;

//Given a sorted array of distinct integers and a target value,return the index if the target is found.If not,return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n)runtime complexity.
public class SearchInsert {
    public int searchInsert (int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        int mid = 0;

        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target) {
                break;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            }
        }

        if (nums[mid] < target) {
            mid++;
        }

        return mid;
    }
}
