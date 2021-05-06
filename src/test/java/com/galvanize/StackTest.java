package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    Stack stack;

    @BeforeEach
    public void init() {
        stack = new Stack();
    }

    @Test
    public void isEmpty() {
        //SETUP

        //EXECUTION
        boolean actualIsEmpty = stack.isEmpty();

        //ASSERT
        assertTrue(actualIsEmpty, "Stack should be empty when nothing has been added");
    }

    @Test
    public void peek_stackIsEmpty_returnsNull() {
        //SETUP

        //EXECUTION
        Node actual = stack.peek();

        //ASSERT
        assertNull(actual, "Should return null when peeking at an empty stack");
    }

    @Test
    public void push_oneObjectToStack() {
        //SETUP
        Node node1 = new Node(3);

        //EXECUTION
        stack.push(node1);
        boolean actualIsEmpty = stack.isEmpty();
        Node actualTopNode = stack.peek();

        //ASSERT
        assertFalse(actualIsEmpty, "Stack should not be empty after adding one node");
        assertEquals(node1, actualTopNode, "Top object should be the object that was added in");
    }

    @Test
    public void pop_returnsTopObject() {
        //SETUP
        Node node1 = new Node(3);
        stack.push(node1);

        //EXECUTION
        Node actualPoppedNode = stack.pop();

        //ASSERT
        assertEquals(node1, actualPoppedNode, "Should pop the top object in the stack");

    }

    @Test
    public void push_ThreeObjectsToStack() {
        //SETUP
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(7);


        //EXECUTION
        stack.push(node1);
        stack.push(node2);
        stack.push(node3);
        Node poppedNode1 = stack.pop();
        Node poppedNode2 = stack.pop();
        Node poppedNode3 = stack.pop();

        //ASSERT
        assertEquals(node3, poppedNode1, "Should return the top object (node3)");
        assertEquals(node2, poppedNode2, "Should return the top object (node2)");
        assertEquals(node1, poppedNode3, "Should return the top object (node1)");
    }
}
