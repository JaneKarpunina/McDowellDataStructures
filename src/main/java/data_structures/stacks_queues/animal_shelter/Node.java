package data_structures.stacks_queues.animal_shelter;

import java.time.LocalDateTime;

class Node<T> {
    Node<T> next = null;

    T data;

    LocalDateTime localDateTime;

    public Node(T data) {
        this.data = data;
        localDateTime = LocalDateTime.now();
    }

    public void appendToTail(T item) {

        Node<T> newNode = new Node<>(item);
        Node<T> node = this;

        while(node.next != null) {
            node = node.next;
        }

        node.next = newNode;
    }
}
