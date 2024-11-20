import java.util.*;

public class selectionSort {
    public void Selection_sort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int mini = i; // Initialize the minimum index
            for (int j = i + 1; j < n; j++) { // Compare with remaining elements
                if (arr[j] < arr[mini]) { // Find the smallest element
                    mini = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {13, 24, 35, 56, 14};
        int n = arr.length;

        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selectionSort sorter = new selectionSort();
        sorter.Selection_sort(arr, n);
    }
}
