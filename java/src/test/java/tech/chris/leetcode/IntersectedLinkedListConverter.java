package tech.chris.leetcode;

import org.junit.jupiter.params.provider.Arguments;

public class IntersectedLinkedListConverter {
    private final int intersectVal;
    private final int[] listA;
    private final int[] listB;
    private final int skipA;
    private final int skipB;

    public IntersectedLinkedListConverter (int intersectVal, int[] listA, int[] listB, int skipA, int skipB) {
        this.intersectVal = intersectVal;
        this.listA = listA;
        this.listB = listB;
        this.skipA = skipA;
        this.skipB = skipB;

        if (this.listA.length == 0) {
            throw new IllegalArgumentException("listA is empty");
        } else if (intersectVal != 0) {
            if (this.listA.length < skipA) {
                throw new IllegalArgumentException("listA length is less than skipA");
            } else if (this.listA[skipA] != intersectVal) {
                throw new IllegalArgumentException("listA[intersectVal] is not correct");
            }
        }

        if (this.listB.length == 0) {
            throw new IllegalArgumentException("ListB is empty");
        } else if (intersectVal != 0) {
            if (this.listB.length < skipB) {
                throw new IllegalArgumentException("listB length is less than skipB");
            } else if (this.listB[skipB] != intersectVal) {
                throw new IllegalArgumentException("listB[intersectVal] is not correct");
            }
        }
    }

    public Arguments convert () {
        ListNode currentNode = null;
        ListNode intersectNode = null;
        if (intersectVal != 0) {
            intersectNode = new ListNode(listA[skipA]);
            currentNode = intersectNode;
            for (int i = skipA + 1; i < listA.length; i++) {
                ListNode nextNode = new ListNode(listA[i]);
                currentNode.next = nextNode;
                currentNode = nextNode;
            }
        }

        ListNode headA = new ListNode(listA[0]);
        currentNode = headA;
        for (int i = 1; i < listA.length; i++) {
            if (i == skipA && intersectNode != null) {
                currentNode.next = intersectNode;
                break;
            }

            ListNode nextNode = new ListNode(listA[i]);
            currentNode.next = nextNode;
            currentNode = nextNode;
        }

        ListNode headB = new ListNode(listB[0]);
        currentNode = headB;
        for (int i = 1; i < listB.length; i++) {
            if (i == skipB && intersectNode != null) {
                currentNode.next = intersectNode;
                break;
            }

            ListNode nextNode = new ListNode(listB[i]);
            currentNode.next = nextNode;
            currentNode = nextNode;
        }

        return Arguments.of(headA, headB, intersectNode);
    }
}
