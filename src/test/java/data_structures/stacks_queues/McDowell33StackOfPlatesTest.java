package data_structures.stacks_queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class McDowell33StackOfPlatesTest {

    @Test
    void testSetOfStacks() {

        McDowell33StackOfPlates<Integer> mcDowell33StackOfPlates =
                new McDowell33StackOfPlates<>(3);

        mcDowell33StackOfPlates.push(2);
        mcDowell33StackOfPlates.push(5);
        mcDowell33StackOfPlates.push(7);

        mcDowell33StackOfPlates.push(3);
        mcDowell33StackOfPlates.push(2);
        mcDowell33StackOfPlates.push(10);

        mcDowell33StackOfPlates.push(1);

        assertEquals(1, mcDowell33StackOfPlates.pop());
        assertEquals(10, mcDowell33StackOfPlates.pop());

        assertEquals(7, mcDowell33StackOfPlates.popAt(0));
        assertEquals(2, mcDowell33StackOfPlates.popAt(1));

        mcDowell33StackOfPlates.push(8);
        mcDowell33StackOfPlates.push(11);
        mcDowell33StackOfPlates.push(15);

        assertEquals(15, mcDowell33StackOfPlates.popAt(2));

        assertEquals(11, mcDowell33StackOfPlates.pop());
        assertEquals(8, mcDowell33StackOfPlates.pop());


    }

}