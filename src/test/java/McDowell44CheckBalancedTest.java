import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class McDowell44CheckBalancedTest {

    @Test
    void testCheckBalanced() {

        Node root = new Node(0);

        Node left = new Node(1);
        Node right = new Node(2);

        root.setChildren(new ArrayList<>(Arrays.asList(left, right)));

        Node node3 = new Node(3);
        Node node4 = new Node(4);

        Node node5 = new Node(5);
        Node node6 = new Node(6);

        left.setChildren(new ArrayList<>(Arrays.asList(node3, node4)));
        node3.setChildren(new ArrayList<>(Collections.singletonList(node5)));

        McDowell44CheckBalanced mcDowell44CheckBalanced = new McDowell44CheckBalanced();

        boolean isBalanced = mcDowell44CheckBalanced.checkBalanced(root);

        assertFalse(isBalanced);

        node5.setChildren(new ArrayList<>(Collections.singletonList(node6)));

        isBalanced = mcDowell44CheckBalanced.checkBalanced(root);

        assertFalse(isBalanced);

        node5.addChild(new Node(7));

        node4.addChild(new Node(8));
        Node node9 = new Node(9);
        right.addChild(node9);
        right.addChild(new Node(12));

        node3.addChild(new Node(10));
        node9.addChild(new Node(11));

        isBalanced = mcDowell44CheckBalanced.checkBalanced(root);

        assertTrue(isBalanced);


    }

}