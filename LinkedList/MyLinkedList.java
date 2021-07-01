package LinkedList;

public class MyLinkedList {
    int val;
    MyLinkedList next;
    MyLinkedList head;
    int length = 0;

    MyLinkedList(int val) {
        this.val = val;
    }

    /** Initialize your data structure here. */
    public MyLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is
     * invalid, return -1.
     */
    public int get(int index) {
        if (head == null || index+1 > length)
            return -1;

        MyLinkedList pointer = head;
        while (index > 0 && pointer != null) {
            pointer = pointer.next;
            index--;
        }
        if (index == 0 && pointer != null)
            return pointer.val;

        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After
     * the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        MyLinkedList node = new MyLinkedList(val);
        node.next = head;
        head = node;
        length++;
        //print(head, "head");
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        MyLinkedList node = new MyLinkedList(val);
        if (head == null) {
            head = node;
            length++;
            return;
        }
        MyLinkedList pointer = head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = node;
        length++;
        //print(head, "tail");
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index
     * equals to the length of linked list, the node will be appended to the end of
     * linked list. If index is greater than the length, the node will not be
     * inserted.
     */
    public void addAtIndex(int index, int val) {
        MyLinkedList node = new MyLinkedList(val);
        if(index == length) {
            addAtTail(val);
            return;
        }

        if (head == null) {
            if (index == 0) {
                head = node;
                length++;
            }
            return;
        }

        MyLinkedList prev = null;
        MyLinkedList curr = head;

        if (index == 0) {
            addAtHead(val);
        } else {
            // System.out.println("Index : " + index);
            while (index > 0 && curr != null) {
                prev = curr;
                curr = curr.next;
                index--;
            }
            // System.out.println("Index : " + index);
            if (index == 0) {
                node.next = curr;
                prev.next = node;
                length++;
            }
        }
        // print(head, "add Index");

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (head == null || index + 1 > length)
            return;

        if (head.next == null) {
            if (index == 0) {
                length--;
                head = null;
            }
            return;
        }

        MyLinkedList prev = null;
        MyLinkedList curr = head;

        if (index == 0) {
            head = head.next;
            length--;
            return;
        }

        while (index > 0) {
            prev = curr;
            curr = curr.next;
            index--;
        }

        if (index == 0 && curr != null) {
            prev.next = curr.next;
            length--;
        }
        // print(head, "del Index");
    }
}