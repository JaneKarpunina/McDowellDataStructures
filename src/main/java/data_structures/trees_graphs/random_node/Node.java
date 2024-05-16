package data_structures.trees_graphs.random_node;

public class Node<T extends Comparable<T>> {

    T value;

    int size;

    Node<T> left;
    Node<T> right;

    public Node(T value) {
        this.value = value;
    }
}
