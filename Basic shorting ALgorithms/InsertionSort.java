
public class InsertionSort {
    public static void InsertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }
    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 4, 5 };
        InsertionSort(arr);
        printarray(arr);
    }

}
