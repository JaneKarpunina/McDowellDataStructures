package data_structures.stacks_queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class McDowell34QueueViaStacksTest {

    @Test
    void testQueueViaStacks() {

        McDowell34QueueViaStacks<Integer> mcDowell34QueueViaStacks
                = new McDowell34QueueViaStacks<>();
        mcDowell34QueueViaStacks.push(5);
        mcDowell34QueueViaStacks.push(10);
        mcDowell34QueueViaStacks.push(15);
        mcDowell34QueueViaStacks.push(3);
        mcDowell34QueueViaStacks.push(4);
        mcDowell34QueueViaStacks.push(17);
        mcDowell34QueueViaStacks.push(20);

        assertEquals(5, mcDowell34QueueViaStacks.pop());
        assertEquals(10, mcDowell34QueueViaStacks.pop());
        assertEquals(15, mcDowell34QueueViaStacks.pop());


        mcDowell34QueueViaStacks.push(7);
        mcDowell34QueueViaStacks.push(6);

        assertEquals(3, mcDowell34QueueViaStacks.pop());

        mcDowell34QueueViaStacks.push(11);

        assertEquals(4, mcDowell34QueueViaStacks.pop());
        assertEquals(17, mcDowell34QueueViaStacks.pop());
        assertEquals(20, mcDowell34QueueViaStacks.pop());

        assertEquals(7, mcDowell34QueueViaStacks.pop());
        assertEquals(6, mcDowell34QueueViaStacks.pop());
        assertEquals(11, mcDowell34QueueViaStacks.pop());


    }
}