package com.galvanize;


public class LinkedList {

    private Node head = null;

    public Node getHead() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Node node) {
        if(head == null) {
            head = node;
            return;
        }

        Node currNode = head;

        while(currNode.getNext() != null) {
            currNode = currNode.getNext();
        }

        currNode.setNext(node);
    }

    public Node getFirst() {
        return getHead();
    }

    public Node getLast() {
        if(head == null) return null;

        Node currNode = head;

        while(currNode.getNext() != null) {
            currNode = currNode.getNext();
        }

        return currNode;
    }

    public Node get(int n) throws IndexOutOfBoundsException {
        Node currNode = head;

        for(int i = 1; i < n; i++) {
            currNode = currNode.getNext();
            if(currNode == null) throw new IndexOutOfBoundsException("Index out of bounds exception");
        }

        return currNode;
    }

    public int contains(Node node) {
        int index = 0;
        if(head == node) return index;

        Node currNode = head;

        while(currNode.getNext() != null) {
            if(currNode.getData() == node.getData()) {
                return index;
            }
            currNode = currNode.getNext();
            index++;
        }

        return -1;
    }

    public void delete(Node target) {
        Node prev = new Node(-1);
        Node curr = head;
        if(curr == target) {
            head = curr.next;
        }

        while(curr != null) {
            if(curr == target) {
                prev.next = curr.next;
                break;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public void delete(int n) {
        int index = 1;
        Node preNode = new Node(-1);
        Node currNode = head;

        if(n == 1) {
            head = head.next;
        }

        for(int i = 1; i < n; i++) {
            preNode = currNode;
            currNode = currNode.next;
        }

        preNode.next = currNode.next;
    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
