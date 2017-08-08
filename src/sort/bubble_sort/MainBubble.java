package sort.bubble_sort;

public class MainBubble  {
    private static int[] array = makeArray();

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        printArray(array);
        sort.sortArray(array);
        sort.printSortArray(array);
    }

    private static void printArray(int[] array) {
        System.out.println("Default array : ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static int[] makeArray() {
        int[] array = new int[(int) (Math.random() * 20)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

}
