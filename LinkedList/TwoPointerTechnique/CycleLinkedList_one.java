package LinkedList.TwoPointerTechnique;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class CycleLinkedList_one {

    /*
     * Traversing each node and changing the val which can later be checked if there
     * is a cycle
     */

    // public boolean hasCycle(ListNode head) {
    // while (head != null && head.next != null) {
    // if (head.val == 1000000)
    // return true;
    // head.val = 1000000;
    // head = head.next;
    // }
    // return false;
    // }

    /*
     * Using two-pointer approach. One fast and other slow. They will come together
     * if there is a cycle
     */

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }

}
