package data_structures.trees_graphs.random_node;

public class Node<T extends Comparable<T>> {

    public T value;

    int size;

    public Node<T> left;
    public Node<T> right;

    public Node(T value) {
        this.value = value;
    }
}
