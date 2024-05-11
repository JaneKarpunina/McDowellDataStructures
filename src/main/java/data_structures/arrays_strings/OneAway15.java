package data_structures.arrays_strings;

public class OneAway15 {

    boolean isOneAway(String first, String second) {

        int firstLength = first.length();
        int secondLength = second.length();


        int difference = firstLength - secondLength;

        if (Math.abs(difference) > 1) return false;

        boolean changed = false;

        if (difference == 0) {
            for (int i = 0; i < firstLength; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    if (changed) return false;
                    else {
                        changed = true;
                    }
                }
            }

            return true;
        } else {
            int minLength = (difference > 0) ? secondLength : firstLength;
            if (difference > 0) {
                String toSwap = first;
                first = second;
                second = toSwap;
            }
            int j = 0;

            return !isOneAway(first, second, minLength, changed);
        }
    }

    private static boolean isOneAway(String first, String second,
                                     int minLength, boolean changed) {
        int j;
        for (int i = 0; i < minLength; i++) {
            if (changed) {
                j = i + 1;
            } else {
                j = i;
            }
            if (first.charAt(i) != second.charAt(j)) {

                if (changed) {
                    return true;
                } else {
                    changed = true;
                }

            }
        }
        return false;
    }


}
