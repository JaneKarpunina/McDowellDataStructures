package data_structures.linked_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Intersection27Test {

    @Test
    void areIntersectingTest() {

        Intersection27<Integer> intersection27 = new Intersection27<>();

        Node<Integer> node = new Node<>(5);
        node.appendToTail(3);
        node.appendToTail(4);
        node.appendToTail(6);
        node.appendToTail(7);

        Node<Integer> intersection = new Node<>(9);
        node.appendToTail(intersection);
        node.appendToTail(10);
        node.appendToTail(3);

        Node<Integer> secondNode = new Node<>(1);
        secondNode.appendToTail(5);
        secondNode.appendToTail(intersection);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.setHead(node);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.setHead(secondNode);

        boolean result = intersection27.areIntersecting(list1, list2);

        assertTrue(result);

        Node<Integer> thirdNode = new Node<>(5);
        node.appendToTail(3);
        node.appendToTail(4);
        node.appendToTail(6);
        node.appendToTail(7);
        node.appendToTail(9);
        node.appendToTail(10);
        node.appendToTail(3);

        list2.setHead(thirdNode);

        result = intersection27.areIntersecting(list1, list2);

        assertFalse(result);

    }
}