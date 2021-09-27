// Java implementation of QuickSort

import java.util.Arrays;

class GFG {

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */
    static int partition(int[] arr, int low, int high) {

        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /* The main function that implements QuickSort
              arr[] --> Array to be sorted,
              low --> Starting index,
              high --> Ending index
     */
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            System.out.println("Position: " + pi);
            System.out.println(Arrays.toString(arr));

            // Sort elements before Partition
            quickSort(arr, low, pi - 1);
            System.out.println("Before Position: " + pi);
            System.out.println(Arrays.toString(arr));

            // Sort elements after Partition
            quickSort(arr, pi + 1, high);
            System.out.println("After Position: " + pi);
            System.out.println(Arrays.toString(arr));
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = {19, 23, 1, 4, 8, 9, 14, 19};
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(arr));

    }
}