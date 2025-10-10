package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Queue<Integer> helper = new LinkedList<>();
        System.out.print("Original Queue: ");
        while(!q.isEmpty()){
            int element = q.remove();
            helper.add(element);
            System.out.print(element+" ");
        }
    }
}
