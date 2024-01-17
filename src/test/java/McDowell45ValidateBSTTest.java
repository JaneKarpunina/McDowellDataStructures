import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class McDowell45ValidateBSTTest {

    @Test
    void validateBST() {

        Node node7 = new Node(7);

        Node node5 = new Node(5);
        Node node11 = new Node(11);

        node7.addChild(node5);
        node7.addChild(node11);

        Node node3 = new Node(3);
        Node node6 = new Node(6);

        node5.addChild(node3);
        node5.addChild(node6);

        Node node1 = new Node(1);
        Node node4 = new Node(4);

        node3.addChild(node1);
        node3.addChild(node4);

        Node node10 = new Node(10);
        Node node15 = new Node(15);

        node11.addChild(node10);
        node11.addChild(node15);

        McDowell45ValidateBST mcDowell45ValidateBST = new McDowell45ValidateBST();

        boolean isBST = mcDowell45ValidateBST.validateBST(node7);

        assertTrue(isBST);

        node6.addChild(new Node(1));
        node6.addChild(new Node(2));

        isBST = mcDowell45ValidateBST.validateBST(node7);

        assertFalse(isBST);


    }

    @Test
    void validateBSTOnlyLeftChildrenCase() {

        Node node3 = new Node(3);

        Node node7 = new Node(7);
        Node node9 = new Node(9);

        Node node5 = new Node(5);
        Node node10 = new Node(10);
        Node node11 = new Node(11);

        node3.addChild(node7);

        node7.addChild(node9);

        node9.addChild(node5);
        node9.addChild(node10);

        node10.addChild(node11);

        McDowell45ValidateBST mcDowell45ValidateBST = new McDowell45ValidateBST();

        boolean isBST = mcDowell45ValidateBST.validateBST(node3);

        assertFalse(isBST);


    }


}