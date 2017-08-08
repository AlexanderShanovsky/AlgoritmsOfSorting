package sort.bubble_sort;

import sort.ArraySorter;

public class BubbleSort implements ArraySorter {

    @Override
    public int[] sortArray(int[] array) {
        doSort(array);
        return array;
    }

    private void doSort(int[] array) {
        for (int i = 0, j = 1; i < array.length; i++, j++) {
            for (int k = 0; k < array.length - j; k++) {
                if (array[k] > array[k + 1]) {
                    swap(array, k);
                }
            }
        }
    }

    private int[] swap(int[] array, int index) {
        array[index] = array[index] + array[index + 1];
        array[index + 1] = array[index] - array[index + 1];
        array[index] = array[index] - array[index + 1];
        return array;
    }

    public void printSortArray(int[] array) {
        System.out.println("Sorted array :");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
