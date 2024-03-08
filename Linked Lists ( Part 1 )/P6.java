public class P6 {

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

    public void removeNthfromEnd(int n) {
        int s = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            s++;
        }
        if (n == s) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        P6 ll = new P6();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2, 9);
        ll.printLinkedList();
        ll.removeNthfromEnd(2);
        ll.printLinkedList();
    }
}