package tech.chris.leetcode;

//Given an integer array nums and an integer val,remove all occurrences of val in nums in-place.The relative order of the elements may be changed.
//
//Since it is impossible to change the length of the array in some languages,you must instead have the result be placed in the first part of the array nums.More formally,if there are k elements after removing the duplicates,then the first k elements of nums should hold the final result.It does not matter what you leave beyond the first k elements.
public class RemoveElement implements ISolution {
    public int removeElement (int[] nums, int val) {
        int current = 0;
        int next = 0;
        while (next < nums.length) {
            if (nums[next] == val) {
                next++;
            } else {
                if (current != next) {
                    nums[current] = nums[next];
                }
                current++;
                next++;
            }
        }

        return current;
    }
}
