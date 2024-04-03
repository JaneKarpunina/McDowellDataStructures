package data_structures.arrays_strings;

public class PalindromePermutation14 {

    public static final int LOW_CASE_LETTERS_COUNT = 26;

    boolean isPalindromePermutation(String s) {

        String stringWithNoSpaces = s.replaceAll("\\s", "").toLowerCase();

        int[] counts = new int[LOW_CASE_LETTERS_COUNT];

        for (int i = 0; i < stringWithNoSpaces.length(); i++) {

            int number = stringWithNoSpaces.charAt(i) - 'a';

            counts[number]++;

        }

        int size = stringWithNoSpaces.length();

        boolean isOdd = size % 2 != 0;
        boolean oddFound = false;
        int count = 0;

        for (int i = 0; i < LOW_CASE_LETTERS_COUNT; i++) {
            count = counts[i];

            if (count % 2 != 0) {

                if (!isOdd) {
                    return false;
                } else {
                    if (oddFound) {
                        return false;
                    } else {
                        oddFound = true;
                    }
                }

            }
        }

        return true;

    }
}
