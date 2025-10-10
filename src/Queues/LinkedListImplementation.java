package Queues;

public class LinkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class QueueA{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x){
            Node temp = new Node(x);
            if (size == 0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int peek(){
            if (size == 0) System.out.println("Queue is Empty");
            else return head.val;
            return -1;
        }
        public int remove(){
            size--;
            int top = head.val;
            head = head.next;
            return top;
        }
        public void display(){
            if (size == 0) {System.out.println("Queue is Empty"); return;}
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty() {
            if (size == 0) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        QueueA q1 = new QueueA();
        System.out.println(q1.isEmpty());
        q1.display();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(7);
        q1.display();
        System.out.println(q1.peek());
        q1.remove();
        q1.display();
        System.out.println(q1.size);
    }
}
