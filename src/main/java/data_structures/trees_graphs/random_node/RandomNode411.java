package data_structures.trees_graphs.random_node;

public class RandomNode411<T extends Comparable<T>> {

    Node<T> head;

    public void insert(T value) {
        Node<T> newNode = new Node<T>(value);
        newNode.size = 1;
        if (head == null) head = newNode;
        else {
            insertNode(newNode, head);
        }
    }

    private void insertNode(Node<T> newNode, Node<T> head) {

        head.size++;
        if (newNode.value.compareTo(head.value) <= 0) {
            Node<T> left = head.left;

            if (left == null) {
                head.left = newNode;
            } else {
                insertNode(newNode, left);
            }
        } else {
            Node<T> right = head.right;
            if (right == null) {
                head.right = newNode;
            } else {
                insertNode(newNode, right);
            }

        }
    }

    public void delete(T value) {
        deleteNode(value, head, null);
    }

    private void deleteNode(T value, Node<T> head, Node<T> ancestor) {
        if (head == null) return;

        if (value.equals(head.value)) {
            head.size--;
            findInorderSuccessor(head, ancestor);
        }
        else if (value.compareTo(head.value) < 0) {
            deleteNode(value, head.left, head);
        }
        else {
            deleteNode(value, head.right, head);
        }
    }

    private void findInorderSuccessor(Node<T> head, Node<T> ancestor) {
        Node<T> right = head.right;
        if (right == null) {
            if (ancestor != null) {
              head.value = ancestor.value;
              head.right = ancestor.right;
              head.size = ancestor.size - 1;
              if (this.head == ancestor) this.head = head;
              else this.head.size--;
            }
            else {
                head = null;
            }
            return;
        }
        this.head.size--;
        Node<T> left = right.left;
        if (left == null) {
            head.value = right.value;
            head.right = right.right;
            right = null;
            return;
        }
        right.size--;

        while (left.left != null) {
            left.size--;
            left = left.left;
        }
        head.value = left.value;
        left = null;
    }

    public Node<T> find(T value) {
        return find(value, head);
    }

    public Node<T> find(T value, Node<T> head) {
        if (head == null) return null;

        if (value.equals(head.value)) return head;
        else if (value.compareTo(head.value) < 0) {
            return find(value, head.left);
        } else {
            return find(value, head.right);
        }
    }

    public Node<T> getRandomNode() {
        if (head == null) return null;
        return getRandomNode(head);
    }

    private Node<T> getRandomNode(Node<T> head) {
        int randomInt = (int) (Math.random() * (head.size) - 1) + 1;
        if (randomInt == 1) {
            return head;
        }
        if (head.left == null || randomInt >= 2 + head.left.size) {
            return getRandomNode(head.right);
        } else if (head.right == null || randomInt >= 2 && randomInt <= head.left.size + 1) {
            return getRandomNode(head.left);
        }

        return null;

    }
}
