package data_structures.stacks_queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class McDowell35SortStackTest {

    @Test
    void testSortStack() {
        McDowell35SortStack<Integer> mcDowell35SortStack = new McDowell35SortStack<>();

        mcDowell35SortStack.push(5);
        mcDowell35SortStack.push(3);
        mcDowell35SortStack.push(7);
        mcDowell35SortStack.push(10);
        mcDowell35SortStack.push(15);
        mcDowell35SortStack.push(25);
        mcDowell35SortStack.push(17);

        assertEquals(3, mcDowell35SortStack.pop());
        assertEquals(5, mcDowell35SortStack.pop());
        assertEquals(7, mcDowell35SortStack.pop());
        assertEquals(10, mcDowell35SortStack.pop());
        assertEquals(15, mcDowell35SortStack.pop());

        mcDowell35SortStack.push(20);
        mcDowell35SortStack.push(21);

        assertEquals(17, mcDowell35SortStack.pop());
        assertEquals(20, mcDowell35SortStack.pop());
        assertEquals(21, mcDowell35SortStack.pop());
        assertEquals(25, mcDowell35SortStack.pop());

    }
}