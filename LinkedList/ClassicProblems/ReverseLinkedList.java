package LinkedList.ClassicProblems;

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

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode h = head;
        ListNode p = head.next;

        while (p != null) {
            ListNode temp = new ListNode(p.val, head);
            h.next = p.next;
            p = p.next;
            head = temp;
        }
        return head;
    }
}
