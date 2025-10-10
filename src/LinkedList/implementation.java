package LinkedList;

public class implementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;

        void deleteAtIndex(int index){

            Node temp = head;
            if (index == size - 1) {tail = temp; size--;}
            else if (index == 0){ head = head.next; size--;}

            for (int i = 1; i <= index; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        void insertAtBeginning(int val){
            Node temp = new Node(val);
            if (head == null){ // empty list
//                head = tail =temp;
                insertAtEnd(val);
            }
            else { // non-empty
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
            }
            else
                tail.next = temp;
            tail = temp;
            size++;
        }

        void insertAt(int index, int val){
            Node t = new Node(val);
            Node temp = head;
            if (index == size){
                insertAtEnd(val);
                return;
            }
            else if (index  == 0){
                insertAtBeginning(val);
                return;
            }

            else if (index < 0 || index > size){
                System.out.println("Wrong index: "+index);
            }
            for (int i = 1; i <= index - 1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int index){
            Node temp = head;

            if (index < 0 || index >= size){
                System.out.println("Wrong index");
                return -1;
            }

            for (int i = 0; i < index; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

//        int size(){
//                Node temp = head;
//                int count = 0;
//                while (temp != null){
//                    count++;
//                    temp = temp.next;
//                }
//                return count;
//            }
        }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4); // 4
        ll.insertAtEnd(5); // 4 5
        ll.insertAtEnd(12);  // 4 -> 5 -> 12
        ll.display();
        ll.insertAtBeginning(22);  // 22 -> 4 -> 5 -> 12
        ll.display();
        ll.insertAt(2, 10);  // 22 -> 4 -> 10 -> 5 -> 12
        ll.display();
        ll.insertAt(0, 100); // 100 -> 22 -> 4 -> 10 -> 5 -> 12
        ll.display();
//        System.out.println(ll.getAt(2));
        ll.deleteAtIndex(0); // 100 -> 22 -> 10 -> 5 -> 12
        ll.display();

    }
}
