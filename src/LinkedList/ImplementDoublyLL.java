package LinkedList;

public class ImplementDoublyLL {
    public static class Node{
        int val;
        Node prev;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    public static class DoublyLL {
        static Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null) head = temp;
            else
                tail.next = temp;
            size++;
        }
        void insertAtBegin(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = tail = temp;
//                insertAtEnd(val);
            }
            else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if (idx == size){
                insertAtEnd(val);
                return;
            }
            else if (idx == 0)
                insertAtBegin(val);

            else if (idx < 0 && idx > size){
                System.out.println("Wrong Index");
            }
            for (int i = 1; i < idx;idx++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DoublyLL DLL = new DoublyLL();
        DLL.insertAtEnd(10);
        DLL.display();
        DLL.insertAtBegin(5);
        DLL.display();
        DLL.insertAt(2, 7);
        DLL.display();
    }
}
