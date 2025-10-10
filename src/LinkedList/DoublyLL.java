package LinkedList;

import java.util.spi.AbstractResourceBundleProvider;

public class DoublyLL {

    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayrev(Node tail){
        Node temp = tail;
        while (temp!= null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static Node insertAtBegin(Node head, int val){
        Node t = new Node(val);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void insertAtEnd(Node head, int val){
        Node tail = head;
        Node t = new Node(val);
        while(tail.next!=null){
            tail = tail.next;
        }
        t.prev = tail;
        tail.next = t;
        tail = t;
    }
    public static void insertAt(Node head, int idx, int val){
        Node temp = head;
        Node t = new Node(val);
        if (idx == 0) {
            head = insertAtBegin(head, val);
            return;
        }
        for (int i=1;i<idx;i++){
            temp =temp.next;
        }
        if (temp.next == null) insertAtEnd(head, val);
        t.next = temp.next;
        t.prev = temp;
        temp.next.prev = t;
        temp.next = t;
    }

    public static void display2(Node random){
        Node temp = random;
        // move this temp backwards to the head
        while (temp.prev!= null){
            temp = temp.prev;
        }
        System.out.println("Head of the linked list is: "+temp.val);
    }
    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        display(a);
        Node x = insertAtBegin(a, 30);
        display(x);
        insertAtEnd(x, 100);
        display(x);
        insertAt(x,4,50);
        display(x);
//        displayrev(e);
//        display2(a);
    }
}
