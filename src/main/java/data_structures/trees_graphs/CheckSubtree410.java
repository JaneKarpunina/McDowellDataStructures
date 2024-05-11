package data_structures.trees_graphs;

import java.util.List;

public class CheckSubtree410 {

    boolean isSubtree(Node t1, Node t2) {

        if (t2 == null) return false;

        if (t1 != null) {
            boolean isSubNode = isSubtreeNode(t1, t2);

            Node t1Left = null;
            Node t1Right = null;
            List<Node> t1Children = t1.getChildren();
            if (t1Children != null) {
                if (!t1Children.isEmpty()) {
                    t1Left = t1.getChildren().get(0);
                }
                if (t1Children.size() > 1) {
                    t1Right = t1.getChildren().get(1);
                }
            }
            boolean isSubLeft = isSubtree(t1Left, t2);
            boolean isSubRight = isSubtree(t1Right, t2);

            return isSubNode || isSubLeft || isSubRight;
        }

        return false;
    }

    private boolean isSubtreeNode(Node t1, Node t2) {
        if (t2 == null) return true;
        if (t1 == null) return false;
        if (t1.equals(t2)) {

            List<Node> t1Children = t1.getChildren();
            List<Node> t2Children = t2.getChildren();
            Node t1Left = null;
            Node t1Right = null;
            Node t2Left = null;
            Node t2Right = null;

            if (t1Children != null) {
                if (!t1Children.isEmpty()) {
                    t1Left = t1.getChildren().get(0);
                }
                if (t1Children.size() > 1) {
                    t1Right = t1.getChildren().get(1);
                }
            }
            if (t1Children != null) {
                if (!t2Children.isEmpty()) {
                    t2Left = t2.getChildren().get(0);
                }
                if (t2Children.size() > 1) {
                    t2Right = t2.getChildren().get(1);
                }
            }
            return isSubtreeNode(t1Left, t2Left) &&
                    isSubtreeNode(t1Right, t2Right);
        }
        return false;
    }
}
