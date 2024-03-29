package data_structures.arrays_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUnique11Test {

    @Test
    void isUnique() {

        char[] array = "asbcvridlKk".toCharArray();

        IsUnique11 isUnique11 = new IsUnique11();
        assertTrue(isUnique11.isUnique(array));

        array = "asbcvridlKssk".toCharArray();
        assertFalse(isUnique11.isUnique(array));

        assertTrue(isUnique11.isUnique("asbcvridlk", true));
        assertTrue(isUnique11.isUnique("asbcvridlk127KTDq", false));

        assertFalse(isUnique11.isUnique("asbcvrivdlk", true));
        assertFalse(isUnique11.isUnique("asbcvridlk127KTDqfi", false));

    }
}