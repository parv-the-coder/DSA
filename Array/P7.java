import java.util.*;

public class P7 {

    public static void Pairs(int Array[]) {
        for (int i = 0; i < Array.length; i++) {
            int current = Array[i];
            for (int j = i + 1; j < Array.length; j++) {
                System.out.print("(" + current + "," + Array[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int Array[] = { 2, 4, 6, 8, 10 };
        Pairs(Array);
    }

}
