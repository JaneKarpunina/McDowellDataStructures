package data_structures.arrays_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLify13Test {

    @Test
    void replaceSpaces() {

        char[] array = new char[] { 'a', 'b', 'd', ' ', 'f', 'd', ' ', 'w', ' ', ' ', ' ', ' '};
        URLify13 urLify13 = new URLify13();
        urLify13.replaceSpaces(array);

        for (char c : array) {
            System.out.print(c + " ");
        }

        array = new char[] { 'k', '0', ' ', 'a', 'b', 'd', ' ', 'f', 'd', ' ', 'w',
                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        urLify13.replaceSpaces(array);

        for (char c : array) {
            System.out.print(c + " ");
        }


    }
}