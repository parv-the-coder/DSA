public class P10 {
    public static int optimisedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int half = optimisedPower(x, n / 2);
        int ans = half * half;
        if (n % 2 != 0) {
            ans = x * ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(optimisedPower(2, 5));
    }
}
