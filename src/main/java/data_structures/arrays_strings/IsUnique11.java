package data_structures.arrays_strings;

public class IsUnique11 {


    public boolean isUnique(char[] array) {

        mergeSort(array, 0, array.length - 1);

        char previous = array[0];

        for (int i = 1; i < array.length; i++) {

            if (previous == array[i]) {
                return false;
            }

            previous = array[i];

        }

        return true;
    }

    private void mergeSort(char[] array, int begin, int end) {

        if (begin == end) return;

        int middle = (begin + end)/2;

        mergeSort(array, begin, middle);
        mergeSort(array, middle + 1, end);

        merge(array, begin, middle, end);

    }

    private void merge(char[] array, int begin, int middle, int end) {

        char[] helper = new char[end - begin + 1];

        int k = 0;
        int firstIndex = begin;
        int secondIndex = middle + 1;

        while (firstIndex <= middle && secondIndex <= end) {

            if (array[firstIndex] < array[secondIndex]) {
                helper[k] = array[firstIndex];
                firstIndex++;
            }
            else {
                helper[k] = array[secondIndex];
                secondIndex++;
            }

            k++;
        }

        while (firstIndex <= middle) {

            helper[k] = array[firstIndex];
            firstIndex++;
            k++;
        }

        while (secondIndex <= end) {

            helper[k] = array[secondIndex];
            secondIndex++;
            k++;
        }

        k = 0;

        for (int i = begin; i <= end; i++) {
            array[i] = helper[k];
            k++;
        }

    }

}
