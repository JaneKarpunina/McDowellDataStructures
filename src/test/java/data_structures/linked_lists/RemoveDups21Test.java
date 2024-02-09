package data_structures.linked_lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class RemoveDups21Test {

    LinkedList<Integer> list = new LinkedList<>();

    @BeforeEach
    void setUp() {

        Node<Integer> node = new Node<>(5);

        node.appendToTail(3);
        node.appendToTail(3);
        node.appendToTail(4);
        node.appendToTail(5);
        node.appendToTail(5);
        node.appendToTail(5);
        node.appendToTail(5);
        node.appendToTail(1);
        node.appendToTail(4);
        node.appendToTail(120);
        node.appendToTail(1);
        node.appendToTail(1);

        list.setHead(node);

    }

    @Test
    void removeDuplicatesTest() {

        RemoveDups21<Integer> removeDups21 = new RemoveDups21<>();
        removeDups21.removeDuplicates(list);

        Node<Integer> head = list.getHead();

        int count = 0;

        while (head != null) {

            count++;
            head = head.next;
        }

        assertEquals(5, count);
    }

    @Test
    void removeDuplicatesWithoutBufferTest() {

        RemoveDups21<Integer> removeDups21 = new RemoveDups21<>();
        removeDups21.removeDuplicatesWithoutBuffer(list);

        Node<Integer> head = list.getHead();

        int count = 0;

        while (head != null) {

            count++;
            head = head.next;
        }

        assertEquals(5, count);

    }
}