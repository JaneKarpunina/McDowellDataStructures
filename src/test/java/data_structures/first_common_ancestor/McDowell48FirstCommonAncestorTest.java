package data_structures.first_common_ancestor;

import data_structures.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class McDowell48FirstCommonAncestorTest {

    Node node1;

    Node node7;
    Node node13;
    Node node17;
    Node node15;
    Node node18;
    Node node20;

    @BeforeEach
    void setUp() {

        node1 = new Node(1);

        Node node5 = new Node(5);
        Node node10 = new Node(10);

        Node node11 = new Node(11);
        node13 = new Node(13);

        node15 = new Node(15);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node17 = new Node(17);

        node20 = new Node(20);
        Node node2 = new Node(2);
        node7 = new Node(7);

        node18 = new Node(18);
        Node node21 = new Node(21);

        node1.addChild(node5);
        node1.addChild(node10);

        node5.addChild(node11);
        node5.addChild(node13);

        node10.addChild(node15);

        node11.addChild(node3);
        node11.addChild(node4);

        node3.addChild(node20);
        node4.addChild(node2);
        node4.addChild(node7);

        node15.addChild(node17);

        node17.addChild(node18);
        node17.addChild(node21);
    }

    @Test
    void testFindFirstCommonAncestor() {

        McDowell48FirstCommonAncestor mcDowell48FirstCommonAncestor
                = new McDowell48FirstCommonAncestor();

        Node result = mcDowell48FirstCommonAncestor.findFirstCommonAncestor(node1, node13, node7);

        assertEquals(5, result.getId());
    }

    @Test
    void testFindFirstCommonAncestor2() {

        McDowell48FirstCommonAncestor mcDowell48FirstCommonAncestor
                = new McDowell48FirstCommonAncestor();

        Node result = mcDowell48FirstCommonAncestor.findFirstCommonAncestor(node1, node13, node17);

        assertEquals(1, result.getId());
    }

    @Test
    void testFindFirstCommonAncestor3() {

        McDowell48FirstCommonAncestor mcDowell48FirstCommonAncestor
                = new McDowell48FirstCommonAncestor();

        Node result = mcDowell48FirstCommonAncestor.findFirstCommonAncestor(node1, node15, node18);

        assertEquals(10, result.getId());
    }

    @Test
    void testFindFirstCommonAncestor4() {

        McDowell48FirstCommonAncestor mcDowell48FirstCommonAncestor
                = new McDowell48FirstCommonAncestor();

        Node result = mcDowell48FirstCommonAncestor.findFirstCommonAncestor(node1, node7, node20);

        assertEquals(11, result.getId());
    }

}