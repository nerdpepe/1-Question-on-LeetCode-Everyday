package LinkedList.TwoPointerTechnique;
// https://leetcode.com/problems/intersection-of-two-linked-lists/

public class IntersectionLinkedList_Fast {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLen = 0, bLen = 0;
        ListNode pointA = headA;
        ListNode pointB = headB;

        while (headA != null) {
            aLen++;
            headA = headA.next;
        }

        while (headB != null) {
            bLen++;
            headB = headB.next;
        }

        if (aLen - bLen > 0) {
            for (int i = 1; i <= aLen - bLen; i++)
                pointA = pointA.next;
        } else {
            for (int i = 1; i <= bLen - aLen; i++)
                pointB = pointB.next;
        }

        while (pointA != null && pointB != null) {
            if (pointA == pointB)
                return pointA;

            pointA = pointA.next;
            pointB = pointB.next;
        }

        return null;
    }
}
