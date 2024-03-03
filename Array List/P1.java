import java.util.ArrayList;

public class P1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(4);
        System.out.println(list);
        // list.remove(1);
        // System.out.println(list);
        // System.out.println(list.contains(5));
        // System.out.println(list.get(0));
        // list.add(0, 1);
        // System.out.println(list);
        list.set(0, 0);
        System.out.println(list);
    }
}
