import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {19, 23, 1, 4, 8, 9, 14, 19};
        int n = arr.length;
        System.out.println("Array: " + Arrays.toString(arr) + " Length: " + n);
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int position = partition(array, start, end);

            System.out.println("After Partition: " + position);
            System.out.println(Arrays.toString(array));

            quickSort(array, start, position - 1);
            System.out.println("Left Operation: " + position);
            System.out.println(Arrays.toString(array));

            quickSort(array, position + 1, end);
            System.out.println("Right Operation: " + position);
            System.out.println(Arrays.toString(array));
        }
    }

    public static void swap(int[] array, int position1, int position2) {
        int temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, end);
        return i + 1;
    }
}
