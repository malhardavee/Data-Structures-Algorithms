package OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {

    public static class Arraylist{
        int[] arr = new int[2];
        int index = 0;
        int size = 0;

        public void add(int element){

            if (size == arr.length){
                int[] brr = Arrays.copyOf(arr, arr.length * 2);
//                arr = new int[brr.length];
//                arr = Arrays.copyOf(brr, brr.length);
                arr = brr;
            }
            arr[index] = element;
            index++;
            size++;
        }

        public int size(){
            return index;
        }
    }
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size());
        arr.add(3);
        System.out.println(arr.size());
    }
}
