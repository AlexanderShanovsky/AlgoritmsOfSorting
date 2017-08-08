package sort.selection_sort;

public class MainSelection {
    private static int[] array = makeArray();

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        printArray(array);
        selectionSort.sortArray(array);
        selectionSort.printSortedArray(array);
    }

    private static int[] makeArray() {
        int[] array = new int[(int) (Math.random() * 20)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    private static void printArray(int[] array) {
        System.out.println("Default array : ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}


