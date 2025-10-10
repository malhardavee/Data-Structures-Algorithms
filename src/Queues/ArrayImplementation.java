package Queues;

import java.util.LinkedList;

public class ArrayImplementation {

    public static class QueueA{
        int f = -1, r = -1;
        int[] arr = new int[5];
        int size = 0;

        public void add(int val){
            if (r == arr.length-1){
                System.out.println("Queue is full!");
                return;
            }
            if (f == -1)
            {
                f = r = 0;
                arr[0] = val;
            }
            else{
                arr[++r] = val;
            }
            size++;
        }
        public int remove(){
            if (size == 0) {System.out.println("Queue is Empty!"); return -1;}
            size--;
            f++;
            return arr[f];
        }
        public int peek(){
            return arr[f];
        }

        public boolean isEmpty(){
            if (size == 0) return true;
            else return false;
        }
        public void display(){
            if (size == 0) System.out.println("Queue is Empty");
            else {
            for (int i = f; i <= r; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        }
    }

    public static void main(String[] args) {
        QueueA q = new QueueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
