package sort.shall_sort;


public class MainShall {
    private static int[] array = makeArray();

    public static void main(String[] args) {
        ShallSort shallSort = new ShallSort();
        printArray(array);
        shallSort.sortArray(array);
        shallSort.printSortArray(array);
    }
    private static int[] makeArray() {
        int[] array = new int[(int) (Math.random() * 30)];
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



