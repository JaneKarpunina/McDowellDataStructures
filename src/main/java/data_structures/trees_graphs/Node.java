package data_structures.trees_graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Node {

    Integer id;

    public Node(Integer id) {
        this.id = id;
    }

    ArrayList<Node> children = new ArrayList<>();

    Node parent;

    boolean marked = false;
    boolean markedSecond = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }

    public void addChild(Node child) {
        children.add(child);
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    public boolean isMarkedSecond() {
        return markedSecond;
    }

    public void setMarkedSecond(boolean markedSecond) {
        this.markedSecond = markedSecond;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(id, node.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
