package Stacks;
import java.util.*;
public class StockSpanProblem {
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int i=0;
        res.add(-1);
        i = 1;
        while (i < arr.length){
            while (arr[i] > arr[st.peek()]  && st.size() > 0){
                st.pop();
            }
            if (st.size() == 0) {
                st.push(i);
            }
            else{
                res.add(i - st.peek());
                st.push(i);
            }
            i++;
        }
        System.out.println(res);
    }
}
