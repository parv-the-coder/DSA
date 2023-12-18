public class P6 {

    public static String substring(String str, int si, int ei) {
        String sub = "";
        for (int i = si; i < ei; i++) {
            sub += str.charAt(i);
        }
        return sub;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(substring(str, 0, 4));
        System.out.println(str.substring(0, 8));
    }
}
