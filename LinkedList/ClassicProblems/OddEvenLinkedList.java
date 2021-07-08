public class OddEvenLinkedList {
    /**
     * Definition for singly-linked list. public class ListNode { int val; ListNode
     * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
     * ListNode next) { this.val = val; this.next = next; } }
     */
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;

        ListNode oddHead = head;
        ListNode evenHead = head.next;

        ListNode oddTail = head;
        ListNode evenTail = head.next;

        int counter = 1;
        ListNode ptr = head.next.next;

        while (ptr != null) {
            if (counter % 2 == 1) {
                oddTail.next = ptr;
                oddTail = ptr;
                ptr = ptr.next;
                oddTail.next = null;

            } else {
                evenTail.next = ptr;
                evenTail = ptr;
                ptr = ptr.next;
                evenTail.next = null;
            }
            counter++;
        }

        oddTail.next = evenHead;
        evenTail.next = null;
        return oddHead;
    }
}
