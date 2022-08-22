package tech.chris.leetcode;

//You are given the heads of two sorted linked lists list1 and list2.
//Merge the two lists in a one sorted list.The list should be made by splicing together the nodes of the first two lists.
//Return the head of the merged linked list.
public class Merge2SortedList {
    public ListNode mergeTwoLists (ListNode list1, ListNode list2) {
        ListNode top = null;
        ListNode current = null;
        while (list1 != null && list2 != null) {
            int val;
            if (list1.val <= list2.val) {
                val = list1.val;
                list1 = list1.next;
            } else {
                val = list2.val;
                list2 = list2.next;
            }

            if (top == null) {
                top = new ListNode(val);
                current = top;
            } else {
                current.next = new ListNode(val);
                current = current.next;
            }
        }

        if (list1 == null && list2 == null) {
            return top;
        }

        ListNode nonNullList = list1 == null ? list2 : list1;
        while (nonNullList != null) {
            if (top == null) {
                top = new ListNode(nonNullList.val);
                current = top;
            } else {
                current.next = new ListNode(nonNullList.val);
                current = current.next;
            }

            nonNullList = nonNullList.next;
        }


        return top;
    }
}
