import java.util.*;

public class BubbleSort {
    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                int swapprevious = swap;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                    System.out.println(swap);
                }
                // System.out.println(j);
                if (swapprevious == swap) {
                    break;
                }

            }
            // System.out.println(i);
            break;
        }
    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 4, 5 };
        BubbleSort(arr);
        printarray(arr);
    }
}
