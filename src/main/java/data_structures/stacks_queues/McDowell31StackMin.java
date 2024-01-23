package data_structures.stacks_queues;

import java.util.NoSuchElementException;

public class McDowell31StackMin<T extends Comparable<T>> {

    private static class StackNode<T> {

        private final T data;

        private T min;
        private StackNode<T> next;

        public StackNode(T data) {
          this.data = data;
        }
    }

    private StackNode<T> top;

    private int size = 0;

    public T pop() {

        if (top == null) throw new NoSuchElementException();
        T result = top.data;
        top = top.next;
        size--;
        return result;


    }

    public void push(T item) {
      if (isEmpty()) {
          top = new StackNode<>(item);
          top.min = item;
      }

      else {
        T min = min();
        if (min.compareTo(item) < 0) {
            StackNode<T> node = new StackNode<>(item);
            node.next = top;
            top = node;
            top.min = min;
        }
        else {
            StackNode<T> node = new StackNode<>(item);
            node.next = top;
            top = node;
            top.min = item;
        }
      }
        size++;
    }

    public T min() {
      if (top == null) throw new NoSuchElementException();
      return top.min;
    }

    public int size() {
      return size;
    }

    boolean isEmpty() {
        return top == null;
    }


}
