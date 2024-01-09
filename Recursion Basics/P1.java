public class P1 {
    public static void Decreasing(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            Decreasing(n - 1);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        Decreasing(n);
    }
}