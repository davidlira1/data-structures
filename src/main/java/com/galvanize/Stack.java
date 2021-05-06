package com.galvanize;

public class Stack {

    private Node top = null;

    public boolean isEmpty() {
        return top == null;
    }

    public Node peek() {
        return top;
    }

    public void push(Node node) {
        Node tmp = top;
        top = node;
        top.next = tmp;
    }

    public Node pop() {
        //YES RETURN TOP BUT, REASSIGN TOP
        Node topObject = top;
        top = top.next;
        return topObject;
    }
}
