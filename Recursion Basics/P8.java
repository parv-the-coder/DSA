public class P8 {

    public static int lastoccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastoccurance(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 9, 8, 4, 2, 5, 5, 6, 6, 5, 5, 2, 1 };
        System.out.println(lastoccurance(arr, 5, 0));
    }
}
