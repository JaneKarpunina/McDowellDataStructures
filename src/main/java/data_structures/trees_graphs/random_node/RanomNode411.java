package data_structures.trees_graphs.random_node;

public class RanomNode411<T extends Comparable<T>> {

    Node<T> head;

    void insert(T value) {
        Node<T> newNode = new Node<T>(value);
        newNode.size = 1;
        if (head == null) head = newNode;

        insertNode(newNode, head);
    }

    private void insertNode(Node<T> newNode, Node<T> head) {

        head.size++;
        if (newNode.value.compareTo(head.value) <= 0) {
            Node<T> left = head.left;

            if (left == null) {
                head.left = newNode;
            }
            else {
                insertNode(newNode, left);
            }
        }
        else {
            Node<T> right = head.right;
              if (right == null) {
                  head.right = newNode;
              }
              else {
                  insertNode(newNode, right);
              }

        }
    }

    void delete(T value) {
        deleteNode(value, head);
    }

    private void deleteNode(T value, Node<T> head) {
        if (head == null) return;

        if (value.equals(head.value)) {
            head.size--;
            findInorderSuccessor(head);
        }
        else if (value.compareTo(head.value) < 0) {
            deleteNode(value, head.left);
        }
        else {
            deleteNode(value, head.right);
        }
    }

    private void findInorderSuccessor(Node<T> head) {
        Node<T> right = head.right;
        if (right == null) {
            head = null;
            return;
        }
        Node<T> left = right.left;
        if (left == null) {
            head.value = right.value;
            right = null;
            return;
        }
        right.size--;

        while(left.left != null) {
           left.size--;
           left = left.left;
        }
        head.value = left.value;
        left = null;
    }

    Node<T> find(T value, Node<T> head) {
       if (head == null) return null;

       if (value.equals(head.value)) return head;
       else if (value.compareTo(head.value) < 0) {
           return find(value, head.left);
       }
       else {
           return find(value, head.right);
       }
    }

    Node<T> getRandomNode() {

    }
}
