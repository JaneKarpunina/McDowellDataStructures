package data_structures.stacks_queues.animal_shelter;

import java.util.NoSuchElementException;

public class McDowell36AnimalShelter {

    private final LinkedList<Cat> cats = new LinkedList<>();
    private final LinkedList<Dog> dogs = new LinkedList<>();

    void enqueue(Animal item) {
        if (item instanceof Cat) {
            Node<Cat> catFirst = cats.getHead();

            if (catFirst == null) {
                cats.setHead(new Node<>((Cat)item));
            }
            else {
                catFirst.appendToTail((Cat)item);
            }
        }

        else if (item instanceof Dog) {
            Node<Dog> dogFirst = dogs.getHead();

            if (dogFirst == null) {
                dogs.setHead(new Node<>((Dog)item));
            }
            else {
                dogFirst.appendToTail((Dog)item);
            }

        }
    }

    Animal dequeueAny() {

        Node<Cat> catFirst = cats.head;
        Node<Dog> dogFirst = dogs.head;

        if (catFirst == null && dogFirst == null) {
            throw new NoSuchElementException();
        }

        if (catFirst == null) {
            return getDog(dogFirst);
        }
        if (dogFirst == null) {
            return getCat(catFirst);
        }

        if (catFirst.localDateTime.isBefore(dogFirst.localDateTime)) {

            return getCat(catFirst);
        }

        else {
            return getDog(dogFirst);
        }

    }

    Dog dequeueDog() {

        Node<Dog> dogFirst = dogs.getHead();
        if (dogFirst == null) {
            throw new NoSuchElementException();
        }

        return getDog(dogFirst);
    }

    Cat dequeueCat() {

        Node<Cat> catFirst = cats.getHead();
        if (catFirst == null) {
            throw new NoSuchElementException();
        }

        return getCat(catFirst);
    }

    private Cat getCat(Node<Cat> catFirst) {
        Cat result = catFirst.data;
        cats.setHead(catFirst.next);
        return result;
    }

    private Dog getDog(Node<Dog> dogFirst) {
        Dog result = dogFirst.data;
        dogs.setHead(dogFirst.next);
        return result;
    }
}
