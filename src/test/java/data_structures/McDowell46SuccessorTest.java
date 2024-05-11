package data_structures;

import data_structures.trees_graphs.McDowell46Successor;
import data_structures.trees_graphs.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class McDowell46SuccessorTest {

    @Test
    void testfindNextNodeBST() {

        Node node7 = new Node(7);

        Node node5 = new Node(5);
        Node node11 = new Node(11);

        node7.addChild(node5);
        node7.addChild(node11);

        node5.setParent(node7);
        node11.setParent(node7);

        Node node3 = new Node(3);
        Node node6 = new Node(6);

        node5.addChild(node3);
        node5.addChild(node6);

        node3.setParent(node5);
        node6.setParent(node5);

        Node node1 = new Node(1);
        Node node4 = new Node(4);

        node3.addChild(node1);
        node3.addChild(node4);

        node1.setParent(node3);
        node4.setParent(node3);

        Node node10 = new Node(10);
        Node node15 = new Node(15);

        node11.addChild(node10);
        node11.addChild(node15);

        node10.setParent(node11);
        node15.setParent(node11);

        checkNextNode(node7, node10);
        checkNextNode(node4, node5);
        checkNextNode(node1, node3);

        checkNextNode(node5, node6);
        checkNextNode(node11, node15);
        checkNextNode(node15, null);
    }

    private static void checkNextNode(Node node7, Node node10) {

        McDowell46Successor mcDowell46Successor = new McDowell46Successor();
        Node result = mcDowell46Successor.findNextNodeBST(node7);

        assertEquals(node10, result);
    }

}