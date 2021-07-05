package LinkedList;

import java.util.HashMap;

public class NthNodeRemoval {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        HashMap<Integer, ListNode> hm = new HashMap<>();
        int i = 1;
        ListNode p = head;
        while (head != null) {
            ++i;
            hm.put(i, p);
            p = p.next;
        }

        // edge conditions

        // only one element in the LinkedList
        if (i == 1) {
            head = null;
            return head;
        }

        // if n is 1, remove the last element
        if (n == 1) {
            ListNode node = hm.get(i - 1);
            node.next = node.next.next;
            return head;
        }

        // if n is equal to i (length), remove first element
        if (n == i) {
            head = head.next;
            return head;
        }

        // others
        ListNode node = hm.get(i - n);
        node.next = node.next.next;
        return head;
    }
}
