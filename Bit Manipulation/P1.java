public class P1 {

    public static void oddOreven(int n) {
        int mask = 1;
        if ((n & mask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        oddOreven(5);
        oddOreven(4);
        oddOreven(11);
    }
}