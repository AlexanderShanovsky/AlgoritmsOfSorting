package sort.selection_sort;

import sort.ArraySorter;

public class SelectionSort implements ArraySorter {
    @Override
    public int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexOfMinElement = min(array , i);
            swap(array , indexOfMinElement , i);
        }
        return array;
    }

    private static int min(int[] array , int index) {
        int min = array[index];
        int indexOfMinElement = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfMinElement = i;
            }
        }
        return indexOfMinElement;
    }

    private static int[] swap(int[] array , int indexOfMinElement , int index) {
        if(array[index] != array[indexOfMinElement]) {
            array[index] = array[index] + array[indexOfMinElement];
            array[indexOfMinElement] = array[index] - array[indexOfMinElement];
            array[index] = array[index] - array[indexOfMinElement];
        }
        return array;
    }

    public  void printSortedArray(int[] array) {
        System.out.println("Sorted array : ");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

}