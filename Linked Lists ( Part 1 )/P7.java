public class P7 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        // step-1 create new Node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step-2- newNode next = head
        newNode.next = head;

        // step-3- head = newNode
        head = newNode;
    }

    public void addLast(int data) {

        // step-1 create new Node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step-2- newNode next = head
        tail.next = newNode;

        // step-3- head = newNode
        tail = newNode;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {

        if (head == null || head.next == null) {
            return true;
        }

        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while (right != null) {

            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        P7 ll = new P7();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        // ll.addMiddle(2, 9);
        ll.printLinkedList();
        System.out.println(ll.checkPalindrome());
    }
}