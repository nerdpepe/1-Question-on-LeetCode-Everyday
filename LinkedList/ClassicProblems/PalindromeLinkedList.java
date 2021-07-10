public class PalindromeLinkedList {
    /**
     * Definition for singly-linked list. public class ListNode { int val; ListNode
     * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
     * ListNode next) { this.val = val; this.next = next; } }
     */
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // finding the node after which we would want to reverse list
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode headRev = reverseList(slow.next);

        while (headRev != null) {
            if (head.val != headRev.val)
                return false;

            head = head.next;
            headRev = headRev.next;
        }

        return true;
    }

    // given head, reversing the linked list
    static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode h = head;
        ListNode p = head.next;
        h.next = null;

        while (h != null) {
            h = p.next;
            p.next = head;
            head = p;
            p = h;
        }

        return head;
    }
}
