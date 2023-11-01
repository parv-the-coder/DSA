import java.util.*;

public class P6 {
    public static void reverse(int Array[]) {
        int first = 0, last = Array.length - 1;
        while (first < last) {
            int temp = Array[first];
            Array[first] = Array[last];
            Array[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int Array[] = { 1, 3, 5, 7, 9, 11, 13 };
        reverse(Array);
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
    }

}
