package sort.Qsort;

public class MainQsort {
    private static int[] array = makeArray();

    public static void main(String[] args) {
        Qsort qsort = new Qsort();
        printArray(array);
        qsort.sortArray(array);
        qsort.printSortArray(array);

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


