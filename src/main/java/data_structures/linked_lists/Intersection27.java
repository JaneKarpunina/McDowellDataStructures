package data_structures.linked_lists;

public class Intersection27<T> {

    boolean areIntersecting(LinkedList<T> list1, LinkedList<T> list2) {

        if (list1 == null || list2 == null) {
            return false;
        }

        Node<T> head1 = list1.getHead();
        Node<T> head2 = list2.getHead();

        if (head1 == null || head2 == null) {
            return false;
        }

        Node<T> end;

        while(head1.next != null) {
            head1 = head1.next;
        }

        end = head1;

        while(head2.next != null) {
            head2 = head2.next;
        }

        return head2 == end;
    }
}
