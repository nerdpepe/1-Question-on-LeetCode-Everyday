package LinkedList.TwoPointerTechnique;

//import java.util.HashSet;

public class CycleLinkedList_two {
    // public ListNode detectCycle(ListNode head) {
    // HashSet<ListNode> hs = new HashSet<>();
    // while (head!=null && head.next!=null) {
    // if(!hs.add(head))
    // return head;
    // head = head.next;
    // }
    // return null;
    // }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}
