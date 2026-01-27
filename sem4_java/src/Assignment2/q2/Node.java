package Assignment2.q2;

public class Node{
    int data;
    Node next;

    public Node (int d) {
        data = d;
        next = null;
    }

    @Override
    public String toString() {
        return data + "->";
    }
}
