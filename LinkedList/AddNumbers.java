/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
public class AddNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode point = head;
        int sum = 0, carry = 0;
        while (l1 != null || l2 != null) {
            int a = (l1 == null) ? 0 : l1.val;
            int b = (l2 == null) ? 0 : l2.val;
            sum = a + b + carry;
            point.next = new ListNode(sum % 10);
            carry = sum / 10;
            point = point.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        if (carry > 0)
            point.next = new ListNode(carry);

        return head.next;
    }
}