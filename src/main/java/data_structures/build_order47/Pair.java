package data_structures.build_order47;

import data_structures.trees_graphs.Node;

import java.util.Objects;

public class Pair {

    Node dependant;
    Node dependency;

    public Pair(Node dependency, Node dependant) {

        this.dependant = dependant;
        this.dependency = dependency;
    }

    public Node getDependant() {
        return dependant;
    }

    public void setDependant(Node dependant) {
        this.dependant = dependant;
    }

    public Node getDependency() {
        return dependency;
    }

    public void setDependency(Node dependency) {
        this.dependency = dependency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(dependant, pair.dependant) && Objects.equals(dependency, pair.dependency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dependant, dependency);
    }
}
