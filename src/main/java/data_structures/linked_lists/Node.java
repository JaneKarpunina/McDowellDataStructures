package data_structures.linked_lists;

public class Node<T> {

    T data;

    Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public void appendToTail(T data){

        Node<T> newNode = new Node<T>(data);

        Node<T> current = this;

        while(current.next != null) {

            current = current.next;
        }

        current.next = newNode;

    }

}
