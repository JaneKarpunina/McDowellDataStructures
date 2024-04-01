package data_structures.arrays_strings;

public class URLify13 {

    void replaceSpaces(char[] array) {

        int size = array.length;

        int emptyTailSize = 0;
        int spaceNumber = 0;

        for (int i = size - 1; i >= 0; i--) {

            if (array[i] == ' ' && spaceNumber == 0) {

                emptyTailSize++;

                if (array[i - 1] != ' ') {
                    spaceNumber++;
                }

            } else {
                int j = i + emptyTailSize - (spaceNumber - 1) * 2;
                if (array[i] != ' ') {
                    if (i + 1 >= size) return;

                    array[j] = array[i];

                } else if (spaceNumber != 0) {

                    array[j] = '0';
                    array[j - 1] = '2';
                    array[j - 2] = '%';

                    if (array[i - 1] != ' ') {
                        spaceNumber++;
                    }
                }
            }

        }
    }
}
