import java.util.Stack;

public class P8 {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtGreator[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            // 1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // if - else
            if (s.isEmpty()) {
                nxtGreator[i] = -1;
            } else {
                nxtGreator[i] = arr[s.peek()];
            }

            // 3 push
            s.push(i);
        }

        for (int i = 0; i < nxtGreator.length; i++) {
            System.out.print(nxtGreator[i] + " ");
        }
    }
}
