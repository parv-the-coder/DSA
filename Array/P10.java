import java.util.*;

public class P10 {

    public static void maxSubarraySum(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                int currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
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