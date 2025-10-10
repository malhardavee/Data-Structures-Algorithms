package LinkedList;

public class BasicsLL {

    public static void insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        Node t = head;
        while (t.next != null){
            t = t.next;
        }
        t.next = temp;
    }
    public static void displayr(Node head) {
        if(head == null) return;
        System.out.print(head.data+" ");
        displayr(head.next); 
    }

    public static void display(Node head){
        Node temp = head;
//        while (temp != null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
        for (int i=1; i <= 5; i++){
            temp = temp.next;
            System.out.print(temp.data+" ");
        }
    }
    public static class Node{
        int data; // value
        Node next; // address of next node

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        // 5  3  9  8  16
        a.next = b;  // 5 -> 3  9  8  16
        b.next = c; // 5 -> 3 -> 9  8  16
        c.next = d; // 5 -> 3 ->  9 ->  8  16
        d.next = e; // 5 -> 3 ->  9 ->  8 -> 16

        display(a);
        System.out.println();
//        insertAtEnd(a, 87);
//        display(a);
    }
}
