package data_structures.arrays_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRotation19Test {

    @Test
    void isRotation() {

        StringRotation19 stringRotation19 = new StringRotation19();
        assertTrue(stringRotation19.isRotation("waterbottle", "erbottlewat"));
        assertTrue(stringRotation19.isRotation("wetrzu", "rzuwet"));

        assertFalse(stringRotation19.isRotation("wetrzu", "rzuwe"));
        assertFalse(stringRotation19.isRotation("wetrzujj", "rzuweghj"));

    }
}