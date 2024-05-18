package data_structures.trees_graphs.paths_with_sum;


public class PathWithSumBruteForce412 {

    int sum = 0;
    int result = 0;

    Node head;

    PathWithSumBruteForce412(int sum, Node head) {
        this.sum = sum;
        this.head = head;
    }

    void inOrderTraversal() {
        inOrderTraversal(head);
    }
    void inOrderTraversal(Node node) {

        if (node != null) {
            inOrderTraversal(node.left);
            findPaths(node, node, 0);
            inOrderTraversal(node.right);
        }
    }

    private void findPaths(Node start, Node end, int partialSum) {

        if (end == null) return;

        if (start == end) {
            partialSum = start.value;
        }
        else {
           partialSum = partialSum + end.value;
        }
        if (partialSum == sum) result++;

        findPaths(start, end.right, partialSum);
        findPaths(start, end.left, partialSum);

    }
}
