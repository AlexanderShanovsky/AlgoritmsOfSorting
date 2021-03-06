package sort.Qsort;

import sort.ArraySorter;

public class Qsort implements ArraySorter {


    @Override
    public int[] sortArray(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        doSort(array, startIndex, endIndex);
        return array;
    }

    private static void doSort(int[] array, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(array, start, cur);
        doSort(array, cur+1, end);
    }

    public void printSortArray(int[] array) {
        System.out.println("Sorted array : ");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
