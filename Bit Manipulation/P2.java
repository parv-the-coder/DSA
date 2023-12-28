public class P2 {
    public static int getIthbit(int n, int i) {
        int mask = 1 << i;
        if ((n & mask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthbit(10, 2));
    }
}
