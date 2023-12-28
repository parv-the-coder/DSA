public class P3 {
    public static int setIthbit(int n, int i) {
        int mask = 1 << i;
        return n | mask;
    }

    public static void main(String[] args) {
        System.out.println(setIthbit(10, 2));
    }
}
