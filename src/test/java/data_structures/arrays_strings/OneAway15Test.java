package data_structures.arrays_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneAway15Test {

    @Test
    void isOneAway() {

        OneAway15 oneAway15 = new OneAway15();
        assertTrue(oneAway15.isOneAway("pale", "pple"));
        assertTrue(oneAway15.isOneAway("pale", "ple"));
        assertTrue(oneAway15.isOneAway("ple", "pple"));
        assertTrue(oneAway15.isOneAway("pple", "pple"));

        assertTrue(oneAway15.isOneAway("pal", "pale"));
        assertTrue(oneAway15.isOneAway("qwertz", "qwerxz"));
        assertTrue(oneAway15.isOneAway("dfghj", "dfhj"));
        assertFalse(oneAway15.isOneAway("pale", "ppla"));
        assertFalse(oneAway15.isOneAway("aspale", "pale"));
    }
}