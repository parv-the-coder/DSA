public class P11 {
    public static int tiling(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical n-1
        // horizontal n-2
        return tiling(n - 1) + tiling(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
