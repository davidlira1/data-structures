package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class QueueTest {

    private Queue queue;

    @BeforeEach
    public void init() {
        queue = new Queue();
    }

    @Test
    public void isQueueEmpty() {
        //SETUP

        //EXECUTION
        boolean actual = queue.isEmpty();


        //ASSERT
        assertTrue(actual, "Queue should be empty");

    }

    @Test
    public void peek_QueueIsEmpty_returnNull() {
        //SETUP (BeforeEach)

        //EXECUTION
        Node actual = queue.peek();

        //ASSERT
        assertNull(actual, "Should return null when peeking at an empty queue");
    }


    @Test
    public void add_oneItem() {
        //SETUP
        Node node1 = new Node(3);
        queue.add(node1);

        //EXECUTION
        boolean actualIsNotEmpty = !queue.isEmpty();
        Node actualFrontItem = queue.peek();

        //ASSERT
        assertTrue(actualIsNotEmpty, "Queue should not be empty after adding one item");
        assertEquals(node1, actualFrontItem, "The item added should be the first and last item");
    }

    @Test
    public void remove_returnsFirstItem() {
        //SETUP (BeforeEach)
        Node node1 = new Node(3);
        queue.add(node1);

        //EXECUTION
        Node actualRemovedNode = queue.remove();

        //ASSERT
        assertEquals(node1, actualRemovedNode, "Should return the first item, in this case, the only item added");

    }

    @Test
    public void canAddItemsToTheBackOfTheQueue() {
        //SETUP
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(7);
        Node node4 = new Node(9);
        queue.add(node1);
        queue.add(node2);
        queue.add(node3);
        queue.add(node4);

        //EXECUTION
        Node removedNode1 = queue.remove();
        Node removedNode2 = queue.remove();
        Node removedNode3 = queue.remove();
        Node removedNode4 = queue.remove();

        //ASSERT
        assertEquals(node1, removedNode1, "Should return the first item added");
        assertEquals(node2, removedNode2, "Should return the second item added");
        assertEquals(node3, removedNode3, "Should return the third item");
        assertEquals(node4, removedNode4, "Should return the fourth item");
    }

    @Test
    public void addFourNodes_removeNodes_queueShouldBeEmpty() {
        //SETUP
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(7);
        Node node4 = new Node(9);
        queue.add(node1);
        queue.add(node2);
        queue.add(node3);
        queue.add(node4);
        Node removedNode1 = queue.remove();
        Node removedNode2 = queue.remove();
        Node removedNode3 = queue.remove();
        Node removedNode4 = queue.remove();

        //EXECUTION
        boolean actualIsEmpty = queue.isEmpty();

        //ASSERT
        assertTrue(actualIsEmpty, "Queue should be empty after adding 4 nodes and removing 4 nodes");
    }
}
