import java.util.ArrayList;

public class P5 {

    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(4);
        System.out.println(list);
        swap(list, 1, 2);
        System.out.println(list);
    }
}
