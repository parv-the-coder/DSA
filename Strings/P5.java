public class P5 {
    public static void main(String[] args) {
        String s1 = "Parv";
        String s2 = "Parv";
        String s3 = new String("Parv");
        if (s1 == s2) {
            System.out.println("Equal");
        } else {
            System.out.println("not Equal");
        }
        if (s1 == s3) {
            System.out.println("Equal");
        } else {
            System.out.println("not Equal");
        }
        if (s1.equals(s3)) {
            System.out.println("Equal");
        } else {
            System.out.println("not Equal");
        }
    }
}
