import java.util.Stack;

public class P10 {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true;
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "((a+b) + c+ d)";
        String s2 = "(((a+b) + c+ d))";
        System.out.println(isDuplicate(s1));
        System.out.println(isDuplicate(s2));
    }
}
