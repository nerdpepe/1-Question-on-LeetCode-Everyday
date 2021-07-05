package LinkedList.TwoPointerTechnique;

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

public class NthNodeRemoval_other {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0, head);
        ListNode one = temp;
        ListNode two = temp;
        for (int i = 1; i <= n; i++)
            two = two.next;

        while (two.next != null) {
            one = one.next;
            two = two.next;
        }

        one.next = one.next.next;
        return temp.next;
    }
}
