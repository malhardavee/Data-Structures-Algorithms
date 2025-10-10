package LinkedList;

public class Palindrome {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static Node MiddleNode(Node head){
        Node slow = head;
        Node fast = head;

        while (fast!= null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(4);
        Node e = new Node(13);
        Node f = new Node(100);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

//        System.out.println(MiddleNode(a).data);

    }
}
