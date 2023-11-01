import java.util.*;

public class P5 {

    public static int binarysearch(int array[], int key) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int array[] = { 1, 2, 4, 6, 8, 9, 11, 12, 13 };
        int key = 1;
        int index = binarysearch(array, key);
        System.out.println("Index:" + index);

    }
}
