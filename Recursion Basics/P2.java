public class P2 {
    public static void Increasing(int n) {
        if (n > 0) {
            Increasing(n - 1);
            System.out.print(n + " ");
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        Increasing(n);
    }
}