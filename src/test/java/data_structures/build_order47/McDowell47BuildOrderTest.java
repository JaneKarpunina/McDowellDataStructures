package data_structures.build_order47;

import data_structures.trees_graphs.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class McDowell47BuildOrderTest {

    ArrayList<Node> projects;
    ArrayList<Pair> dependencies;

    Node node1;

    Node node6;


    @BeforeEach
    void setUp() {

        node1 = new Node(1);

        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node6 = new Node(6);

        Pair pair1 = new Pair(node3, node5);
        Pair pair2 = new Pair(node6, node4);

        Pair pair3 = new Pair(node4, node5);
        Pair pair4 = new Pair(node6, node3);

        Pair pair5 = new Pair(node5, node1);

        projects = new ArrayList<>(Arrays.asList(node1, node2, node3, node4, node5, node6));
        dependencies = new ArrayList<>(Arrays.asList(pair1, pair2, pair3, pair4, pair5));
    }

    @Test
    void findBuildOrder() {

        McDowell47BuildOrder mcDowell47BuildOrder = new McDowell47BuildOrder();

        List<Node> result = mcDowell47BuildOrder.findBuildOrder(projects, dependencies);

        assertEquals(6, result.size());



//        assertThrows(RuntimeException.class, new Runnable() {
//            @Override
//            public void run() {
//                mcDowell47BuildOrder.findBuildOrder(
//                        projects, dependencies);
//            }
//        });
//    }
    }


    @Test
    void findBuildOrderException() {

        McDowell47BuildOrder mcDowell47BuildOrder = new McDowell47BuildOrder();
        Pair pair6 = new Pair(node1, node6);
        dependencies.add(pair6);

        try {
            mcDowell47BuildOrder.findBuildOrder(projects, dependencies);
        } catch (RuntimeException ex) {
            assertTrue(ex.getMessage().startsWith("no build order found, projects:"));
        }
    }
}