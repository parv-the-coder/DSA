import java.util.*;

public class P8 {

    public static void SubArray(int numbers[]) {
        int ts = 0;
        int sum = 0;
        int smallest = 0;
        int largest = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                    smallest = numbers[i];
                    largest = numbers[j];
                }
                ts++;
                System.out
                        .println("---> Sum of this Subarray:" + sum + " ---> Smallest:" + smallest + " ---> Largest:"
                                + largest);
                sum = 0;
                smallest = 0;
                largest = 0;
            }
            System.out.println();
        }
        System.out.println("Total Subarrays:" + ts);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        SubArray(numbers);
    }
}