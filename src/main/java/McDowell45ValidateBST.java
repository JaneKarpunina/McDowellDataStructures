import java.util.List;

public class McDowell45ValidateBST {

    boolean validateBST(Node root) {

        if (root == null) {
           return true;
        }

        Values values = checkBST(root);

        return values.isBalanced;

    }

    Values checkBST(Node root) {
        if (root == null) {
            return new Values(0, 0, true);
        }

        List<Node> children = root.getChildren();

        if (children.isEmpty()) {
            return new Values(root.getId(), root.getId(), true);
        }

        Node left = children.get(0);
        Node right = null;

        if (children.size() > 1) {
            right = children.get(1);
        }

        Values leftValues = checkBST(left);

        if (!leftValues.isBalanced()) {
            return new Values(0, 0, false);
        }

        Values rightValues = null;

        if (right != null) {
            rightValues = checkBST(right);

            if (!rightValues.isBalanced()) {
                return new Values(0, 0, false);
            }
        }

        if (rightValues != null) {

            int max = leftValues.getMax();
            int min = rightValues.getMin();

            int current = root.getId();

            if (current < max) {
                return new Values(0, 0, false);
            }
            if (current >= min) {
                return new Values(0, 0, false);
            }

            return new Values(leftValues.getMin(), rightValues.getMax(), true);
        }

        else {

            int max = leftValues.getMax();
            int min = leftValues.getMin();

            int current = root.getId();

            if (current >= max) return new Values(min, current,true);
            if (current < min) return new Values(current, max, true);

            return new Values(0, 0, false);
        }
    }
}
