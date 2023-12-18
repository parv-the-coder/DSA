
public class P3 {
    public static boolean CheckPalidrom(String str) {
        int n = str.length();
        str = str.toLowerCase();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Madam";
        System.out.println("Is the given string is palindrome? : " + CheckPalidrom(str));

    }

}