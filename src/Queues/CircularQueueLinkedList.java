package Queues;

public class CircularQueueLinkedList {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    public static class Cqa{
        int size = 0;
        Node head; Node tail;
        public void add(int val){
            if (size == 0){
                Node temp = new Node(val);
                head = temp; tail = temp;
                tail.next = temp;
            }
            else{
                Node temp = new Node(val);
                tail.next = temp;
                tail = tail.next;
                tail.next = head;

            }
            size++;
        }
        public int remove() throws Exception {
            if (size == 0) throw new Exception("Queue is Empty!");
            int top = head.val;
            if (size == 1) { // removing last element
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            size--;
            return top;
        }

        public int peek() throws Exception{
            if (size == 0) throw new Exception("Queue is Empty");
            else return head.val;
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public void display(){
            if (size == 0) System.out.println("Queue is Empty");
            else{
                System.out.print(head.val+" ");
                Node temp = head.next;
                while (temp!= head){
                    System.out.print(temp.val+" ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Cqa q = new Cqa();
        System.out.println(q.isEmpty());
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        q.add(5);
        q.display();
    }
}
