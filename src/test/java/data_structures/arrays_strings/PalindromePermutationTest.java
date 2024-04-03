package data_structures.arrays_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutationTest {

    @Test
    void isPalindromePermutation() {

        String s = " Tact Coa   ";
        PalindromePermutation14 palindromePermutation14 = new PalindromePermutation14();
        assertTrue(palindromePermutation14.isPalindromePermutation(s));

        s = "asb  Jkhhjb As";
        assertTrue(palindromePermutation14.isPalindromePermutation(s));

        s = "asb  Jkhhjb Asf";
        assertFalse(palindromePermutation14.isPalindromePermutation(s));

        s = "asb  Jkhhjb Ask";
        assertTrue(palindromePermutation14.isPalindromePermutation(s));
    }
}