public class P2 {
    public static void printletters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        String firstName = "Parv";
        String lastName = "King";
        String FullName = firstName + " " + lastName;
        printletters(FullName);
    }
}
