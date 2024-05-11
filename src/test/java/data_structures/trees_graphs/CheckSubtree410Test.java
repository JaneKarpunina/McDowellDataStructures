package data_structures.trees_graphs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheckSubtree410Test {

    @Test
    void isSubtree() {

        Node node1 = new Node(10);
        Node node2 = new Node(7);
        Node node3 = new Node(15);
        node1.setChildren(new ArrayList<>(Arrays.asList(node2, node3)));
        Node node4 = new Node(3);
        node3.setChildren(new ArrayList<>(List.of(node4)));
        Node node5 = new Node(10);
        Node node6 = new Node(4);
        Node node7 = new Node(6);
        Node node8 = new Node(2);
        Node node9 = new Node(8);
        node2.setChildren(new ArrayList<>(Arrays.asList(node5, node9)));
        node5.setChildren(new ArrayList<>(Arrays.asList(node6, node7)));
        node7.setChildren(new ArrayList<>(List.of(node8)));

        Node searched1 = new Node(10);
        Node searched2 = new Node(4);
        Node searched3 = new Node(6);
        searched1.setChildren(new ArrayList<>(Arrays.asList(searched2, searched3)));

        CheckSubtree410 checkSubtree410 = new CheckSubtree410();
        assertTrue(checkSubtree410.isSubtree(node1, searched1));

        searched3 = new Node(4);
        searched1.setChildren(new ArrayList<>(Arrays.asList(searched2, searched3)));
        assertFalse(checkSubtree410.isSubtree(node1, searched1));

        searched3 = new Node(6);
        searched1.setChildren(new ArrayList<>(Arrays.asList(searched2, searched3)));
        Node searched4 = new Node(2);
        searched3.setChildren(new ArrayList<>(List.of(searched4)));
        assertTrue(checkSubtree410.isSubtree(node1, searched1));

    }
}