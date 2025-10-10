package Stacks;

public class LinkedListImplementation {
    public static class Node{ // user defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{
        Node head = null;
        private int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void displayrec(Node h){
            if (h == null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayrev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){ // getter
            return size;
        }

        int pop(){
            int top = head.val;
            if (head == null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            size--;
            head = head.next;
            return top;
        }
        int peek(){
            if (head == null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty(){
            if (size == 0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(1);
        st.display();// 4 5 1
        System.out.println("Size: "+st.size()); // 3
        st.push(7);
        st.push(10);
        st.display();
        st.push(2);
    }
}
