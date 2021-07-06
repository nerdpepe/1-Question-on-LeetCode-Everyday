public class ReverseLinkedList_Recursive {
    static ListNode reverseTheList(ListNode head, ListNode ans) {
        if (head == null || head.next == null)
            return ans;

        ListNode n = head.next;
        head.next = n.next;
        n.next = ans;
        ans = n;

        return reverseTheList(head, ans);
    }

    public ListNode reverseList(ListNode head) {
        ListNode ans = head;
        return reverseTheList(head, ans);
    }
}