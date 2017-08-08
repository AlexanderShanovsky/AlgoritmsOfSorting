package sort.insertion_sort;

import sort.ArraySorter;

public class InsertionSort implements ArraySorter {

    @Override
    public  int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int element = i + 1;
            int index = element;
            for (int k = index; k >= 0; k--) {
                if(array[element] < array[k]) {
                    swap(array , element , k);
                    element--;
                }
            }
        }
        return array;
    }

    private static int[] swap(int[] array, int index, int indexOfSwap) {
        array[index] = array[index] + array[indexOfSwap];
        array[indexOfSwap] = array[index] - array[indexOfSwap];
        array[index] = array[index] - array[indexOfSwap];
        return array;
    }

    public void printSortArray(int[] array) {
        System.out.println("Sorted array : ");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
