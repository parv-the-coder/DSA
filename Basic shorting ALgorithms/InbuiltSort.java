import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class InbuiltSort {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printarray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 4, 5 };
        Integer Arrs[] = { 2, 1, 3, 4, 5 };
        Arrays.sort(arr);
        printarray(arr);
        System.out.println();
        Arrays.sort(arr, 0, 3);
        printarray(arr);
        System.out.println();
        Arrays.sort(Arrs, 0, 5, Collections.reverseOrder());
        printarray(Arrs);

    }
}
