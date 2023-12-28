public class P5 {
    public static int clearIbits(int n, int i) {
        int mask = ~(0) << i;
        return n & mask;
    }

    public static void main(String[] args) {
        System.out.println(clearIbits(15, 2));
    }
}
