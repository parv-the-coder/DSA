public class P4 {
    public static int clearIthbit(int n, int i) {
        int mask = ~(1 << i);
        return n & mask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthbit(10, 1));
    }
}
