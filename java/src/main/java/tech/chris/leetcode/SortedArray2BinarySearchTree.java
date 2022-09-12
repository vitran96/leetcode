package tech.chris.leetcode;

// Given an integer array nums where the elements are sorted in ascending order,convert it to a height-balanced
// binary search tree.
//
// A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs
// by more than one.
//
// 1 <= nums.length <= 104
// -104 <= nums[i] <= 104
// nums is sorted in a strictly increasing order.
public class SortedArray2BinarySearchTree {
    private static TreeNode sortedArrayToBST (final int[] nums, final int l, final int r) {
        if (l > r || l < 0 || r >= nums.length) {
            return null;
        }

        final int middle = (l + r) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = sortedArrayToBST(nums, l, middle - 1);
        node.right = sortedArrayToBST(nums, middle + 1, r);

        return node;
    }

    public TreeNode sortedArrayToBST (int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }
}
