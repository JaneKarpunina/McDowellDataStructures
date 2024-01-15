import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class McDowell42MinimalTreeTest {


    @Test
    void testCreateMinimalTree() {

        McDowell42MinimalTree mcDowell42MinimalTree = new McDowell42MinimalTree();

        int[] array = new int[] {5, 7, 8, 11, 12, 15, 17, 22, 26, 27};

        Node root = mcDowell42MinimalTree.createMinTree(array,0, array.length - 1);

        List<Node> children = root.getChildren();

        assertEquals(children.size(), 2);

        array = new int[] {5, 7, 8, 11, 12, 15, 17};
        root = mcDowell42MinimalTree.createMinTree(array,0, array.length - 1);

        children = root.getChildren();

        assertEquals(children.size(), 2);
    }

}