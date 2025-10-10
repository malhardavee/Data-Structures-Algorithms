package Stacks;

import java.util.*;
public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        // reverse order
        Stack<Integer> st2 = new Stack<>();
        while (st.size()>0){
            int x = st.peek();
            st2.push(st.pop());
        }
        System.out.println(st2);
        Stack<Integer> ans = new Stack<>();
        while(st2.size()>0){
//            int y = st2.peek();
            ans.push(st2.pop());
        }
        System.out.println(ans);
    }
}
