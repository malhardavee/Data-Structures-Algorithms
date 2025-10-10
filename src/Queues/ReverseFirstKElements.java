package Queues;
import java.util.*;
public class ReverseFirstKElements {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int k = 3;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

        for (int i = 1; i <= k; i++){
            st.push(q.poll());
        }

        while (!st.isEmpty()) q.add(st.pop());
        for (int i=1;i<=(q.size() - k); i++){
            q.add(q.remove());
        }

        System.out.println(q);
    }
}
