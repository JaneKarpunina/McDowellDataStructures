package data_structures.arrays_strings;

public class PalindromePermutation14 {

    public static final int LOW_CASE_LETTERS_COUNT = 26;

    boolean isPalindromePermutation(String s) {

        String stringWithNoSpaces = s.replaceAll("\\s", "").toLowerCase();

        int counts = 0;

        for (int i = 0; i < stringWithNoSpaces.length(); i++) {

            int number = stringWithNoSpaces.charAt(i) - 'a';

            if ((counts & 1 << number) != 0) {
                counts &= ~(1 << number);
            } else {
                counts |= 1 << number;
            }

        }

        int size = stringWithNoSpaces.length();

        boolean isOdd = size % 2 != 0;

        if (!isOdd) {
            return counts == 0;
        }
        boolean oddFound = false;

        for (int i = 0; i < LOW_CASE_LETTERS_COUNT; i++) {

            if ((counts & 1 << i) != 0) {

                if (oddFound) {
                    return false;

                } else {
                    oddFound = true;
                }
            }

        }

        return true;

    }
}
