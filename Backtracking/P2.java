public class P2 {
    public static void findAllSubset(String s, int i, String ans) {
        if (i == s.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        findAllSubset(s, i + 1, ans + s.charAt(i));
        findAllSubset(s, i + 1, ans);
    }

    public static void main(String[] args) {
        String s = "abc";
        findAllSubset(s, 0, "");

    }
}
