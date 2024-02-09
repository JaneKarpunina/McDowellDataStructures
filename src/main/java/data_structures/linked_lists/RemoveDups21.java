package data_structures.linked_lists;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups21<T> {

    void removeDuplicates(LinkedList<T> list) {

        Node<T> head = list.getHead();

        Set<T> dataSet = new HashSet<>();

        dataSet.add(head.data);

        while (head.next != null) {

            if (!dataSet.contains(head.next.data)) {
                dataSet.add(head.next.data);
                head = head.next;
            }
            else {
                head.next = head.next.next;
            }
        }
    }

    void removeDuplicatesWithoutBuffer(LinkedList<T> list) {

        Node<T> head = list.getHead();
        Node<T> secondPointer;

        while (head != null) {

            T data = head.data;
            secondPointer = head;

            while (secondPointer.next != null) {

                if (secondPointer.next.data.equals(data)){

                    secondPointer.next = secondPointer.next.next;
                }
                else {
                secondPointer = secondPointer.next;
                }

            }

            head = head.next;

        }

    }
}
