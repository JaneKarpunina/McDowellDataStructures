import java.util.List;

public class McDowell46Successor {

    Node findNextNodeBST(Node node) {

        List<Node> children = node.getChildren();

        if (children.isEmpty() ||
                (children.size() == 1 && children.get(0).getId() <= node.getId())) {

            Node parent = node.getParent();

            while(parent != null) {

                if (parent.getId() >= node.getId()) {
                    return parent;
                }

                parent = parent.getParent();
            }

            return null;

        }

        if (children.size() == 1) {
            return findMinBST(children.get(0));
        }

        return findMinBST(children.get(1));

    }

    private Node findMinBST(Node node) {
        Node min = node;

        List<Node> children = node.getChildren();

        while(!children.isEmpty()) {

            Node next = children.get(0);

            if (next.getId() <= min.getId()) {
                min = next;
                children = next.getChildren();
            }
            else {
                return min;
            }
        }

        return min;
    }
}
