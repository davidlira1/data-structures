package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LinkedListTest {

    @Test
    public void canInitializeNodeWithData() {
        //SETUP
        Node node = new Node(5);
        int expected = 5;

        //EXECUTION
        int actual = node.getData();

        //ASSERT
        assertEquals(expected, actual, "Should initialize node with passed in data value");
        assertEquals(null, node.getNext(), "Should have a next pointer with value of null");
    }


    @Test
    public void isLinkedListEmptyEmpty() {
        //SETUP
        LinkedList linkedList = new LinkedList();
        boolean expected = true;

        //EXECUTION
        boolean actual = linkedList.isEmpty();

        //ASSERT
        assertEquals(expected, actual, "Should return true when linked list is empty");
    }

    @Test
    public void canAddObjectToTheEndOfList() {
        //SETUP
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(5);
        Node node2 = new Node(8);
        int expected = 8;

        //EXECUTION
        linkedList.add(node1);
        linkedList.add(node2);
        int actual = linkedList.getHead().getNext().getData();

        //ASSERT
        assertEquals(expected, actual, "Should add a node to the end of the list");
    }

    @Test
    public void ableToGetFirstItem() {
        //SETUP
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(5);
        Node node2 = new Node(8);
        int expected = 5;

        //EXECUTION
        linkedList.add(node1);
        linkedList.add(node2);
        int actual = linkedList.getFirst().getData();

        //ASSERT
        assertEquals(expected, actual, "Should get the first item in the list");
    }

    @Test
    public void ableToGetLastItem() {
        //SETUP
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(5);
        Node node2 = new Node(8);
        Node node3 = new Node(7);
        int expected = 7;

        //EXECUTION
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        int actual = linkedList.getLast().getData();

        //ASSERT
        assertEquals(expected, actual, "Should get the last item in the list");
    }

    @Test
    public void getTheNthObjectInTheList() {
        //SETUP
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(5);
        Node node2 = new Node(8);
        Node node3 = new Node(7);
        Node node4 = new Node(2);
        Node node5 = new Node(9);
        int expected = 2;

        //EXECUTION
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);
        linkedList.add(node5);
        int actual = linkedList.get(4).getData();

        //ASSERT
        assertEquals(expected, actual, "Should get the nth item in the list");

    }

    @Test
    public void getTheNthObject_throwsIndexOutOfBoundsException() {
        //SETUP
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(5);
        Node node2 = new Node(8);
        linkedList.add(node1);
        linkedList.add(node2);


        //EXECUTION
        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            linkedList.get(3);
        });

        //ASSERT
        assertEquals("Index out of bounds exception", exception.getMessage(), "Should throw an index out of bounds exception if passed in a number to get that is bigger than the number of elements");
    }

    @Test
    public void contains_returnsTheIndexOfTheObject() {
        //SETUP
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(5);
        Node node2 = new Node(8);
        Node node3 = new Node(7);
        Node node4 = new Node(2);
        Node node5 = new Node(9);
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);
        linkedList.add(node5);
        int expected = 2;

        //EXECUTION
        int actual = linkedList.contains(node3);

        //ASSERT
        assertEquals(expected, actual, "Should return the index of the object");

    }

    @Test
    public void contains_returnsNegativeOneIfNotInThere() {
        //SETUP
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(5);
        Node node2 = new Node(8);
        Node node3 = new Node(7);
        Node node4 = new Node(2);
        Node node5 = new Node(9);
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);
        linkedList.add(node5);
        int expected = -1;

        //EXECUTION
        int actual = linkedList.contains(new Node(10));

        //ASSERT
        assertEquals(expected, actual, "Should return -1 if node is not in the list");

    }

    @Test
    public void canDeleteObjectIfItExists() {
        //SETUP
        Node exNode1 = new Node(5);
        Node exNode2 = new Node(8);
        Node exNode3 = new Node(7);
        Node exNode5 = new Node(9);

        Node acNode1 = new Node(5);
        Node acNode2 = new Node(8);
        Node acNode3 = new Node(7);
        Node acNode4 = new Node(2);
        Node acNode5 = new Node(9);

        LinkedList expected = new LinkedList();
        expected.add(exNode1);
        expected.add(exNode2);
        expected.add(exNode3);
        expected.add(exNode5);

        //EXECUTION
        LinkedList actual = new LinkedList();
        actual.add(acNode1);
        actual.add(acNode2);
        actual.add(acNode3);
        actual.add(acNode4);
        actual.add(acNode5);
        actual.delete(acNode4);


        System.out.println(expected.toString());
        System.out.println(actual.toString());


        //ASSERT
        assertEquals(expected.toString(), actual.toString(), "Should delete a node from the list");
    }

    @Test
    public void canDeleteTheNthObject() {
        //SETUP
        Node exNode1 = new Node(5);
        Node exNode2 = new Node(8);
        Node exNode3 = new Node(7);
        Node exNode5 = new Node(9);

        Node acNode1 = new Node(5);
        Node acNode2 = new Node(8);
        Node acNode3 = new Node(7);
        Node acNode4 = new Node(2);
        Node acNode5 = new Node(9);

        LinkedList expected = new LinkedList();
        expected.add(exNode1);
        expected.add(exNode2);
        expected.add(exNode3);
        expected.add(exNode5);

        //EXECUTION
        LinkedList actual = new LinkedList();
        actual.add(acNode1);
        actual.add(acNode2);
        actual.add(acNode3);
        actual.add(acNode4);
        actual.add(acNode5);
        actual.delete(4);


        System.out.println(expected.toString());
        System.out.println(actual.toString());


        //ASSERT
        assertEquals(expected.toString(), actual.toString(), "Should delete the nth node from the list");
    }


}
