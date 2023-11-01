import java.util.*;

public class P3 {
    public static int LinearSearch(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int array[] = { 1, 9, 99, 88, 45, 65, 32, 10, 2, 9, 7 };
        int key = 98;
        int index = LinearSearch(array, key);
        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Key is at index:" + index);
        }
    }
}
