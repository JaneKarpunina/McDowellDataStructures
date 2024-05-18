package data_structures.trees_graphs.random_node;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNode411Test {

    RandomNode411<Integer> randomNode411 = new RandomNode411<>();

    @Test
    void find() {
        RandomNode411<Integer> randomNode411 = new RandomNode411<>();
        randomNode411.insert(10);
        randomNode411.insert(7);
        randomNode411.insert(5);
        randomNode411.insert(12);
        randomNode411.insert(11);
        randomNode411.insert(14);
        randomNode411.insert(16);

        Node<Integer> node1 = randomNode411.find(7);
        node1 = randomNode411.find(12);
        node1 = randomNode411.find(14);

        System.out.println();


    }

    @Test
    void delete() {
        RandomNode411<Integer> randomNode411 = new RandomNode411<>();
        randomNode411.insert(10);
        randomNode411.insert(7);
        randomNode411.insert(5);
        randomNode411.insert(12);
        randomNode411.insert(11);
        randomNode411.insert(14);
        randomNode411.insert(16);

        randomNode411.delete(7);
        randomNode411.delete(12);
        randomNode411.delete(14);

        System.out.println();


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
        randomNode411.insert(16);

        Node<Integer> node1 = randomNode411.getRandomNode();
        node1 = randomNode411.getRandomNode();
        node1 = randomNode411.getRandomNode();
        node1 = randomNode411.getRandomNode();
        node1 = randomNode411.getRandomNode();
        node1 = randomNode411.getRandomNode();

        System.out.println();
    }
}