class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0 || head.next == null)
            return head;

        ListNode tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        // we got length and tail
        // now we can reduce rotations

        k = k % len;
        if (k == 0)
            return head;

        ListNode dummy = new ListNode(-101, head);

        for (int i = 1; i <= len - k; i++) {
            dummy = dummy.next;
        }

        tail.next = head;
        tail = dummy.next;
        dummy.next = null;
        return tail;
    }
}