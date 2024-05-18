package data_structures.trees_graphs.paths_with_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathWithSum412Test {

    @Test
    void inOrderTraversal() {

        Node head = new Node(10);
        Node node1 = new Node(5);
        Node node2 = new Node(11);
        Node node3 = new Node(6);
        Node node4 = new Node(7);
        Node node5 = new Node(4);
        Node node6 = new Node(7);
        Node node7 = new Node(8);

        head.left = node1;
        head.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node6.right = node7;

        PathWithSumBruteForce412 randomNode411 = new PathWithSumBruteForce412(15, head);
        randomNode411.inOrderTraversal();

        assertEquals(randomNode411.result, 3);
    }
}