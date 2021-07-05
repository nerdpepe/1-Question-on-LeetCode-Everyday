package LinkedList.TwoPointerTechnique;

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> hs = new HashSet<>();
        while (headA != null) {
            hs.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (!hs.add(headB))
                return headB;
            headB = headB.next;
        }

        return null;
    }
}
