package data_structures.trees_graphs.random_node;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNode411Test {

    RandomNode411<Integer> randomNode411 = new RandomNode411<>();

    @Test
    void insert() {


    }

    @Test
    void delete() {
    }

    @Test
    void find() {
    }

    @Test
    void getRandomNode() {

        RandomNode411<Integer> randomNode411 = new RandomNode411<>();
        randomNode411.insert(10);
        randomNode411.insert(7);
        randomNode411.insert(5);
        randomNode411.insert(12);
        randomNode411.insert(11);
        randomNode411.insert(14);

        Node<Integer> node1 = randomNode411.getRandomNode();
        node1 = randomNode411.getRandomNode();
        node1 = randomNode411.getRandomNode();
        node1 = randomNode411.getRandomNode();
        node1 = randomNode411.getRandomNode();
        node1 = randomNode411.getRandomNode();

        System.out.println();
    }
}