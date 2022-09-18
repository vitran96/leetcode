package tech.chris.leetcode;

// Given head, the head of a linked list, determine if the linked list has a cycle in it.
//
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//
//Return true if there is a cycle in the linked list. Otherwise, return false.
//
// The number of the nodes in the list is in the range [0, 10^4].
// -10^5 <= Node.val <= 10^5
// pos is -1 or a valid index in the linked-list.
public class LinkedListCycle {
    public boolean hasCycle (ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode hare = head;
        ListNode tortoise = head;

        boolean result = false;

        while (tortoise.next != null && hare.next != null && hare.next.next != null) {

            tortoise = tortoise.next;
            hare = hare.next.next;

            if (tortoise.equals(hare)) {
                result = true;
                break;
            }
        }

        return result;
    }
}
