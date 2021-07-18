/*
* Class name below should be DoublyLinkedList - I know
*/
public class MyLinkedList {

    MyLinkedList prev;
    MyLinkedList next;
    int val;

    // for keeping a check on head
    MyLinkedList head = null;

    // for keeping a count of nodes
    int nodes = 0;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.prev = null;
        this.next = null;
        int val = -1;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is
     * invalid, return -1.
     */
    public int get(int index) {
        if (head == null || index + 1 > nodes)
            return -1;

        MyLinkedList pntr = head;

        // traverse to suitable location
        while (index-- > 0)
            pntr = pntr.next;

        return pntr.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After
     * the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int value) {
        MyLinkedList n = new MyLinkedList();
        n.val = value;

        if (head == null)
            head = n;

        n.next = head;
        head = n;
        nodes++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int value) {
        MyLinkedList n = new MyLinkedList();
        n.val = value;

        // if no nodes
        if (head == null)
            head = n;

        MyLinkedList pntr = head;
        while (pntr.next != null)
            pntr = pntr.next;

        pntr.next = n;
        nodes++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index
     * equals to the length of linked list, the node will be appended to the end of
     * linked list. If index is greater than the length, the node will not be
     * inserted.
     */
    public void addAtIndex(int index, int value) {
        if (index + 1 > nodes)
            return;

        if (index == nodes)
            // add at tail
            addAtTail(val);

        if (index == 0)
            // add at head
            addAtHead(val);

        // make the node
        MyLinkedList n = new MyLinkedList();
        n.val = value;

        MyLinkedList pntr = head;

        while (index-- > 0)
            pntr = pntr.next;

        n.next = pntr.next;
        pntr.next.prev = n;
        n.prev = pntr;
        pntr.next = n;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList(); int param_1 = obj.get(index);
 * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */