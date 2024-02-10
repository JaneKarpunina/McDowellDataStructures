package data_structures.linked_lists;

public class FindKthToLastSingleLinkedList22<T> {

    T findKthToLast(LinkedList<T> list, int k) {

        Node<T> head = list.getHead();

        Node<T> secondPointer = head;

        for (int i = 0; i < k; i++) {

            if (secondPointer == null) {
                return null;
            }
            secondPointer = secondPointer.next;

        }

        if (secondPointer == null) {
            return null;
        }

        while (secondPointer.next != null) {
            secondPointer = secondPointer.next;
            head = head.next;
        }

        return head.data;

    }


}
