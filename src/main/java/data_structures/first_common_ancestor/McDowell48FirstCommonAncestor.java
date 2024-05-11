package data_structures.first_common_ancestor;

import data_structures.trees_graphs.Node;

import java.util.List;

public class McDowell48FirstCommonAncestor {

    Node findFirstCommonAncestor(Node root, Node first, Node second) {

      if (root == first || root == second) {
          return null;
      }

      firstCommonAncestor(root, first);

      return firstCommonAncestor(root, second);
    }

    private Node firstCommonAncestor(Node root, Node first) {

        if (root == first) {
            return root;
        }

        List<Node> children = root.getChildren();

        if (children == null) {
            return null;
        }

        Node result = null;

        for (Node child : children) {
            Node prev = firstCommonAncestor(child, first);

            if (prev != null)  {

                if (prev.isMarked() && prev.isMarkedSecond()) {
                    return prev;
                }

                else {
                    if (!root.isMarked()) {
                        root.setMarked(true);
                    }
                    else {
                        root.setMarkedSecond(true);
                    }

                    result = root;
                }

            }


        }

        return result;
    }
}
