package data_structures.stacks_queues;

import java.util.NoSuchElementException;

public class McDowell34QueueViaStacks<T> {

    class StackNode {

        StackNode next;

        T data;
        public StackNode(T data) {
            this.data = data;
        }
    }

    StackNode first;
    StackNode second;

    public void push(T item) {

        if (second == null) {
            if (first == null) {
                first = new StackNode(item);
            }
            else {
                StackNode newNode = new StackNode(item);
                newNode.next = first;
                first = newNode;
            }
        }
        else {
            while(second != null) {
              StackNode next = second.next;
              second.next = first;
              first = second;
              second = next;
            }
            StackNode newNode = new StackNode(item);
            newNode.next = first;
            first = newNode;
        }
    }

    public T pop() {
        if (second == null) {
            if (first == null) {
                throw new NoSuchElementException();
            }

            while (first.next != null) {
              StackNode newNode = new StackNode(first.data);
              newNode.next = second;
              second = newNode;
              first = first.next;
            }

            T result = first.data;
            first = null;
            return result;

        }

        else {
            T result = second.data;
            second = second.next;
            return result;
        }
    }


}
