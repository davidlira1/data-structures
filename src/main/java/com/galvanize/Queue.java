package com.galvanize;

public class Queue {

    Node head = null;
    Node tail = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Node node) {
        //WHEN EMPTY
        if(head == null) {
            head = node;
            tail = node;
        } else {
            //WHEN NOT EMPTY, TAIL IS REASSIGNED
            tail.next = node;
            tail = node;
        }
    }

    public Node peek() {
        return head;
    }

    public Node remove() {
        //FIRST ITEM
        Node firstItem = head;
        //REASSIGN HEAD TO THE NEXT ONE
        head = head.next;
        //RETURN FIRSTITEM
        return firstItem;
    }
}
