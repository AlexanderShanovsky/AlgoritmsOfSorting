package sort.shall_sort;

import sort.ArraySorter;

public class ShallSort implements ArraySorter {

    @Override
    public int[] sortArray(int[] array) {
        int d = array.length / 2;

        while (d > 0) {
            for (int i = 0; i < array.length - d; i++) {
                int j = i;
                while (j >= 0 && array[j] > array[j + d]) {
                    swap(array, d, j);
                    j--;
                }
            }
            d = d / 2;
        }
        return array;
    }

    private void swap(int[] array, int d, int j) {
        array[j] = array[j] + array[j + d];
        array[j + d] = array[j] - array[j + d];
        array[j] = array[j] - array[j + d];
    }

    public void printSortArray(int[] array) {
        System.out.println("Sorted array : ");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

}
