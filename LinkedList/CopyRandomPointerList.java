/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

public class CopyRandomPointerList {
    public Node copyRandomList(Node head) {
        Node temp = head;
        Node dummy = new Node(-1); // answer
        Node newHead = dummy;

        HashMap<Node, Node> map = new HashMap<>();

        while (temp != null) {
            Node n = new Node(temp.val);
            map.put(temp, n);
            newHead.next = n;
            newHead = n;
            temp = temp.next;
        }

        // go to first node of new list
        newHead = dummy.next;

        while (head != null) {
            newHead.random = map.get(head.random);
            newHead = newHead.next;
            head = head.next;
        }

        return dummy.next;
    }
}
