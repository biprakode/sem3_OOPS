package Assignment2.q2;

public class LinkList {
    Node head;
    Node tail;
    int size = 0;

    public void add(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    public void display() {
        if (size == 0) {
            System.out.println("CLL is empty");
            return;
        }
        Node walker = head;
        System.out.print("CLL: ");
        for (int i = 0; i < size; i++) {
            System.out.print(walker.data + " -> ");
            walker = walker.next;
        }
        System.out.println("(head)");
    }

    public void evenSum() {
        if(size == 0) {
            System.out.println("LL is empty");
        }
        Node walker = head;
        int sum = 0;
        for(int i = 0; i<size ; i++) {
            if (walker.data % 2 == 0) {
                sum += walker.data;
            }
            walker = walker.next;
        }
        System.out.println("Even Sum across CLL = " + sum);
    }
}
