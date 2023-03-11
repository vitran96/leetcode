package tech.chris.leetcode.sortedArray2HeightBalancedBinaryTree;

import tech.chris.leetcode.ListNode;
import tech.chris.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution1 implements SortedArray2HeightBalancedBinaryTree {
    @Override
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        List<TreeNode> list = new LinkedList<>();
        ListNode current = head;
        while (current != null) {
            list.add(new TreeNode(current.val));
            current = current.next;
        }

        return convert(list, 0, list.size() - 1);
    }

    private TreeNode convert(List<TreeNode> list, int l, int r) {
        if (l > r) {
            return null;
        }

        int mid = l + r;
        mid = mid % 2 == 0 ? mid / 2 : mid / 2 + 1;

        TreeNode head = list.get(mid);
        head.left = convert(list, l, mid - 1);
        head.right = convert(list, mid + 1, r);

        return head;
    }
}
