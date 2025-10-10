package LinkedList;

public class LengthOfLL {

    public static int length(Node a){
        int count = 0;
        while (a != null){
            count++;
            a = a.next;
        }
        return count;
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(100);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Length of linked list: "+length(a));
    }
}
