import java.util.*;

public class P9 {

    public static void maxSubarraySum(int numbers[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                int currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum += numbers[k];
                }
                if (max < currsum) {
                    max = currsum;
                }
            }
        }
        System.out.println("Maximum SubArray Sum:" + max);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSubarraySum(numbers);
    }
}