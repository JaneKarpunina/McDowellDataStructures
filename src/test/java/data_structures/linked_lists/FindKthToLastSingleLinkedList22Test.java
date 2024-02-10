package data_structures.linked_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindKthToLastSingleLinkedList22Test {

    @Test
    void findKthToLastTest() {

        FindKthToLastSingleLinkedList22<Integer> findKthToLastSingleLinkedList22
                = new FindKthToLastSingleLinkedList22<>();

        Node<Integer> node = new Node<>(3);
        node.appendToTail(5);
        node.appendToTail(7);
        node.appendToTail(1);
        node.appendToTail(33);
        node.appendToTail(2);
        node.appendToTail(5);
        node.appendToTail(7);
        node.appendToTail(56);
        node.appendToTail(57);
        node.appendToTail(4);
        node.appendToTail(6);

        LinkedList<Integer> list = new LinkedList<>();

        list.setHead(node);

        Integer result = findKthToLastSingleLinkedList22.findKthToLast(list, 3);

        assertEquals(56, result);

        result = findKthToLastSingleLinkedList22.findKthToLast(list, 7);

        assertEquals(33, result);

        result = findKthToLastSingleLinkedList22.findKthToLast(list, 20);

        assertNull(result);

        result = findKthToLastSingleLinkedList22.findKthToLast(list, 9);

        assertEquals(7, result);



    }
}