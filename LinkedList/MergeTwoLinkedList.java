/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class MergeTwoLinkedList {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        ListNode ans = new ListNode (-1, l2);
        
        ListNode h = ans;
        ListNode h_j = l2;
        
        ListNode l_temp = l1;
        
        while(l1 != null) {
            //process node at l1
            // see whether it is less than l2
            // if yes -> insert before it (store l1.next in temp before doing this)
            
            while(h != null) {
                if(h_j == null) {
                    h.next = l1;
                    return ans.next;
                }
                
            if (l1.val <= h_j.val) {
                l_temp = l1.next;
                h.next = l1;
                l1.next = h_j;
                h = h.next;
                l1 = l_temp;
                break;
            } else {
                h = h.next;
                h_j = h_j.next;
            }
            } // inner while
        }
        return ans.next;
    }
}