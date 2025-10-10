package LinkedList;

public class MiddleElement {

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

        while (fast.next!= null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node Next = null;
        while (current!=null){
            Next = current.next;
            current.next = prev;
            prev = current;
            current = Next;
        }
        return prev.next;
    }

    public static boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = head;
        Node temp = reverse(head.next);
        slow.next = temp;
        Node p1 = head;
        Node p2 = slow.next;
        while (p2 != null){
            if (p1.data != p2.data) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
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

        System.out.println(isPalindrome(a));
    }
}
