package data_structures.arrays_strings;


public class StringRotation19 {

    boolean isRotation(String s1, String s2) {

        if (s1 == null || s2 == null) {
            return false;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        int indexFirstString = 0;

        for (int i = 0; i < s2.length(); i++) {

            if (s2.charAt(i) == s1.charAt(indexFirstString)) {
                indexFirstString++;
            } else if (indexFirstString != 0) {
                indexFirstString = 0;
            }

        }

        if (indexFirstString == 0) {
            return false;
        } else {

            // would use equals here, but need to use contains ??
            return s2.substring(0, s2.length() - indexFirstString)
                    .contains(s1.subSequence(indexFirstString, s1.length()));
        }

    }
}
