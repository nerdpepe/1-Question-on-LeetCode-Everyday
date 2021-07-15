/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
public class AddNumbers {
    static int maxLen = 0;

    static int[] getNumber(ListNode l) {
        int[] arr = new int[101];
        int exp = 0;
        while (l != null) {
            arr[exp++] = l.val;
            l = l.next;
        }
        maxLen = (maxLen < exp) ? exp : maxLen;
        return arr;
    }

    static ListNode getLinkedList(int len, int[] m, int[] n) {
        int i = 0;
        int carry = 0;
        int sum = 0;

        ListNode l = new ListNode(0, null);
        ListNode head = l;

        while (m[i] != 0 || n[i] != 0 || carry != 0 || i < len) {
            sum = carry + m[i] + n[i];
            l.next = new ListNode(sum % 10);
            carry = sum / 10;
            l = l.next;
            i++;
        }
        return (head.next == null) ? head : head.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] n_1;
        int[] n_2;
        maxLen = 0;

        // process the 2 linked lists and get numbers
        n_1 = getNumber(l1);
        n_2 = getNumber(l2);

        // convert the number to linked list and return
        return getLinkedList(maxLen, n_1, n_2);
    }
}