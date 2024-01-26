package data_structures.stacks_queues.animal_shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class McDowell36AnimalShelterTest {

    @Test
    void testAnimalShelter() {

        McDowell36AnimalShelter mcDowell36AnimalShelter = new McDowell36AnimalShelter();

        mcDowell36AnimalShelter.enqueue(new Cat("first cat"));
        mcDowell36AnimalShelter.enqueue(new Cat("second cat"));
        mcDowell36AnimalShelter.enqueue(new Dog("first dog"));
        mcDowell36AnimalShelter.enqueue(new Dog("second dog"));
        mcDowell36AnimalShelter.enqueue(new Dog("third dog"));
        mcDowell36AnimalShelter.enqueue(new Cat("third cat"));
        mcDowell36AnimalShelter.enqueue(new Dog("forth dog"));
        mcDowell36AnimalShelter.enqueue(new Cat("forth cat"));

        assertEquals("first cat", mcDowell36AnimalShelter.dequeueAny().name);
        assertEquals("first dog", mcDowell36AnimalShelter.dequeueDog().name);

        assertEquals("second dog", mcDowell36AnimalShelter.dequeueDog().name);
        assertEquals("second cat", mcDowell36AnimalShelter.dequeueAny().name);

        assertEquals("third dog", mcDowell36AnimalShelter.dequeueAny().name);
        assertEquals("third cat", mcDowell36AnimalShelter.dequeueAny().name);

        assertEquals("forth cat", mcDowell36AnimalShelter.dequeueCat().name);
    }
}