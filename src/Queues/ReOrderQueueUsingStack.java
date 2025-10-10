package Queues;
import java.util.*;

public class ReOrderQueueUsingStack {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        // Fill queue with values 1 to 8
        for (int i = 1; i <= 8; i++) q.add(i);

        System.out.println("Original Queue: " + q);

        int n = q.size();
        int half = n / 2;

        // Step 1: Push first half into stack (reverses first half)
        for (int i = 0; i < half; i++) {
            st.push(q.remove());
        }

        // Step 2: Push stack elements back into queue (restoring original order)
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: Move first half (originally second half) to the back
        for (int i = 0; i < half; i++) {
            q.add(q.remove());
        }
        // Step 4: Again push first half into stack
        for (int i = 0; i < half; i++) {
            st.push(q.remove());
        }

        // Step 5: Interleave elements from stack and queue
        while (!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.remove());
        }

        System.out.println("Reordered Queue: " + q);
    }
}
