package data_structures.stacks_queues.animal_shelter;

import java.time.LocalDateTime;

public class LinkedList<T extends Animal> {

    Node<T> head;

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
}
