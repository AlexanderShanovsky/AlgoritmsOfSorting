package sort.counting_sort;

import sort.ArraySorter;

public class CountingSort implements ArraySorter {

    private static int maxElementOfArray(int[] array) {
        int max = array[0];
        for (int i = 1 ; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }

    @Override
    public int[] sortArray(int[] array) {
        int[] tempArray = new int[maxElementOfArray(array) + 1];
        for (int i = 0; i < tempArray.length; i++) {
            int count = 0;
            int value = i;
            for (int j = 0; j < array.length; j++) {
                if(value == array[j]) count++;
            }
            tempArray[i] = count;
        }

        for (int i = 0 , k = 0; i < array.length; k++) {
            int index = tempArray[k];
            for (int j = 0; j < index; j++) {
                array[i] = k;
                i++;
            }
        }

        return array;
    }

    public void printSortArray(int[] array) {
        System.out.println("Sorted array : ");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
