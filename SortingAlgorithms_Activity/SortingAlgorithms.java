package sortingAlgorithms;

public class SortingAlgorithms {

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Array using bubble sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.print("Sorted Array using selection sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

        }
        System.out.print("Sorted Array using insertion sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {9, 2, 7, 1, 10, 5, 4, 6, 8, 3};
        int[] bubbleArray = {9, 2, 7, 1, 10, 5, 4, 6, 8, 3};
        int[] selectionArray = {9, 2, 7, 1, 10, 5, 4, 6, 8, 3};
        int[] insertionArray = {9, 2, 7, 1, 10, 5, 4, 6, 8, 3};

        System.out.println("Original Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        bubbleSort(bubbleArray);
        selectionSort(selectionArray);
        insertionSort(insertionArray);
    }
}
 
