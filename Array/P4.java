import java.util.*;

public class P4 {
    public static int Largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int Smallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 6, 5, 9, 2, 3 };
        int biggest = Largest(numbers);
        System.out.println("Largest Number in Array :" + biggest);

        int shortest = Smallest(numbers);
        System.out.println("Shortest Number in Array :" + shortest);

    }
}
