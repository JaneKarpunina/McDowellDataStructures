package data_structures.trees_graphs;

import java.util.List;

public class McDowell44CheckBalanced {

    public boolean checkBalanced(Node root) {
        if (root == null) {
            return true;
        }

        int result = findTreeHeight(root);

        if (result > 0) {
            return true;
        }
        return false;
    }

    private int findTreeHeight(Node root) {
        if (root == null) {
            return 0;
        }

        List<Node> children = root.getChildren();
        if (children.isEmpty()) {
            return 1;
        }
        Node child1 = children.get(0);
        Node child2 = null;

        if (children.size() > 1) {
            child2 = children.get(1);
        }

        int leftHeight = findTreeHeight(child1);
        int rightHeight = findTreeHeight(child2);

        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }

        if (Math.abs(rightHeight - leftHeight) > 1) {
            return -1;
        }

        return rightHeight > leftHeight ? rightHeight + 1 : leftHeight + 1;

    }
}
