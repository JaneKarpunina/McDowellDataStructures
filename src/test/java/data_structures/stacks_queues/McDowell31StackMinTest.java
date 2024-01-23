package data_structures.stacks_queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class McDowell31StackMinTest {

    @Test
    void testPop() {

        McDowell31StackMin<Integer> mcDowell31StackMin = new McDowell31StackMin<>();
        mcDowell31StackMin.push(1);
        mcDowell31StackMin.push(10);
        mcDowell31StackMin.push(15);

        assertEquals(15, mcDowell31StackMin.pop());
        assertEquals(10, mcDowell31StackMin.pop());
    }

    @Test
    void testPush() {

        McDowell31StackMin<Integer> mcDowell31StackMin = new McDowell31StackMin<>();
        mcDowell31StackMin.push(1);
        mcDowell31StackMin.push(10);
        mcDowell31StackMin.push(15);

        assertEquals(3, mcDowell31StackMin.size());
    }

    @Test
    void testMin() {

        McDowell31StackMin<Integer> mcDowell31StackMin = new McDowell31StackMin<>();
        mcDowell31StackMin.push(10);
        mcDowell31StackMin.push(15);
        mcDowell31StackMin.push(20);
        mcDowell31StackMin.push(5);
        mcDowell31StackMin.push(3);
        mcDowell31StackMin.push(7);

        assertEquals(3, mcDowell31StackMin.min());
        assertEquals(6, mcDowell31StackMin.size());

        mcDowell31StackMin.pop();
        mcDowell31StackMin.pop();

        assertEquals(5, mcDowell31StackMin.min());
        assertEquals(4, mcDowell31StackMin.size());

        mcDowell31StackMin.pop();

        assertEquals(10, mcDowell31StackMin.min());
        assertEquals(3, mcDowell31StackMin.size());

    }

    @Test
    void testIsEmpty() {

        McDowell31StackMin<Integer> mcDowell31StackMin = new McDowell31StackMin<>();
        mcDowell31StackMin.push(10);
        mcDowell31StackMin.push(15);

        assertFalse(mcDowell31StackMin.isEmpty());

        mcDowell31StackMin.pop();
        mcDowell31StackMin.pop();

        assertTrue(mcDowell31StackMin.isEmpty());


    }
}