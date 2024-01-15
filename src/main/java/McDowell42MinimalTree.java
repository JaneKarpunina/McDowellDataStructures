import java.util.Arrays;

public class McDowell42MinimalTree {

    Node createMinTree(int[] array, int start, int end) {

        if (start > end) {
            return null;
        }

        if (start == end) {
            return new Node(array[start]);
        }

        int middle = (start + end)/2;

        Node left = createMinTree(array, start, middle - 1);
        Node right = createMinTree(array, middle + 1, end);

        Node root = new Node(array[middle]);
        if (left != null) {
            root.addChild(left);
        }
        if (right != null) {
            root.addChild(right);
        }

        return root;
    }


}
