package data_structures;

import java.util.Objects;

public class Values {

    int min;

    int max;

    boolean isBalanced;

    public Values(int min, int max, boolean isBalanced) {
        this.min = min;
        this.max = max;
        this.isBalanced = isBalanced;

    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public boolean isBalanced() {
        return isBalanced;
    }

    public void setBalanced(boolean balanced) {
        isBalanced = balanced;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Values values = (Values) o;
        return min == values.min && max == values.max && isBalanced == values.isBalanced;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max, isBalanced);
    }
}
