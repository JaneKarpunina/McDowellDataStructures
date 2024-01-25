package data_structures.stacks_queues;

import java.util.NoSuchElementException;

public class McDowell35SortStack<T extends Comparable<T>> {

    class StackNode {

        T data;

        StackNode next;

        StackNode(T data) {
            this.data = data;
        }

    }

    StackNode top;
    StackNode second;

    public void push(T item) {

        if (top == null) {
            top = new StackNode(item);
            return;
        }

        while (top != null && top.data.compareTo(item) < 0) {

            StackNode nextNode = top.next;
            top.next = second;
            second = top;

            top = nextNode;

        }

        StackNode node = new StackNode(item);
        node.next = top;
        top = node;

        while(second != null) {
            StackNode secondNext = second.next;
            second.next = top;
            top = second;
            second = secondNext;
        }

    }

    public T pop() {

        if (top == null) {
            throw new NoSuchElementException();
        }

        T result = top.data;
        top = top.next;
        return result;
    }

    public T peek() {

        if (top == null) {
            throw new NoSuchElementException();
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }


}
