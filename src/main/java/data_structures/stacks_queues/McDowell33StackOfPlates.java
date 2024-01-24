package data_structures.stacks_queues;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class McDowell33StackOfPlates<T> {

    public class StackNode {

        int size;

        T data;

        StackNode next;

        public StackNode(T data) {
            this.data = data;
        }
    }

   List<StackNode> stackNodes = new ArrayList<>();

   int capacity = 0;

   public McDowell33StackOfPlates(int capacity) {
       this.capacity = capacity;
    }
    public void push(T item) {

       if (stackNodes.isEmpty()) {
           StackNode node = new StackNode(item);
           node.size++;
           stackNodes.add(node);
           return;
       }

       int stackNodesSize = stackNodes.size();

       StackNode node = stackNodes.get(stackNodesSize - 1);

       if (node.size < capacity) {
           StackNode newNode = new StackNode(item);
           newNode.size = node.size + 1;
           newNode.next = node;

           stackNodes.remove(stackNodesSize - 1);
           stackNodes.add(newNode);
       }

       else {
           StackNode newNode = new StackNode(item);
           newNode.size++;
           stackNodes.add(newNode);
       }

    }

    public T pop() {

       if (stackNodes.isEmpty()) {
           throw new NoSuchElementException();
       }

       int stackNodesSize = stackNodes.size();

       StackNode node = stackNodes.get(stackNodesSize - 1);
       T result = node.data;
       stackNodes.remove(stackNodesSize - 1);
       node = node.next;

       if (node != null) {
           stackNodes.add(node);
       }

       return result;
    }

    public T popAt(int index) {

       int stackNodesSize = stackNodes.size();

       if (index >= stackNodesSize) {
           throw new NoSuchElementException();
       }

       StackNode node = stackNodes.get(index);

       T result = node.data;
       stackNodes.remove(index);
       node = node.next;

       if (node != null) {
           stackNodes.add(index, node);
       }

       return result;

    }



}
