import java.util.*;

public class P11 {

    public static void Kadane(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int flag = 0;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (numbers[i] >= 0) {
                flag = 0;
            } else {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println(ms);
        } else {
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        int numbers[] = { -1, -2, -6, -1, -3 };
        Kadane(numbers);
    }
}