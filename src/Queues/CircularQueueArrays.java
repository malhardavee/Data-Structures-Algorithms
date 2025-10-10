package Queues;

public class CircularQueueArrays {
    public static class Cqa{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[8];

        public void add(int val) throws Exception{
            if (size == arr.length){
                throw new Exception("Queue is Full!");
            }
            else if (size == 0){
                f = r = 0;
                arr[0] = val;
                size++;
                return;
            }
            else if (r < arr.length-1){
                arr[++r] = val;
                size++;
            }
        }
        public int remove() throws Exception{
            if (size==0){
                throw new Exception("Queue is Empty!");
            }
            else{
                int val = arr[f];
                if (f == arr.length-1) f = 0;
                else f++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if (size == 0){
                throw new Exception("Queue is Empty!");
            }
            else return arr[f];
        }

        public boolean isEmpty(){
            if (size == 0) return true;
            else return false;
        }

        public void display(){
            if (size == 0) System.out.println("Queue is Empty");
            else {
                if (f <= r){
                    for (int i = f; i <= r; i++){
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                }
                else{
                    for (int i = f; i < arr.length; i++){
                        System.out.print(arr[i] + " ");
                    }
                    for (int i = 0; i <= r; i++){
                        System.out.println(arr[i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        Cqa q = new Cqa();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display(); // 1 2 3 4
        q.remove();
        q.display(); // 2 3 4
        q.add(5);
        q.display(); // 2 3 4 5
        q.add(6);
        q.display(); // 6 2 3 4 5
        q.add(7);
        q.display();
        q.add(8);
        q.display();
    }
}
