public class P6 {
    public static int clearrangeofIthbit(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int mask = a | b;
        return n & mask;
    }

    public static void main(String[] args) {
        System.out.println(clearrangeofIthbit(10, 2, 4));
    }
}
