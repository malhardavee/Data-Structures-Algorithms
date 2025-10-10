package Stacks;

import java.util.Stack;

public class ReverseWithRecursion {

    public static void PushAtBottom(Stack<Integer> st, int target){
        if(st.size() == 0){
            st.push(target);
            return;
        }
        int top = st.pop();
        PushAtBottom(st, target);
        st.push(top);
    }

    public static void reverse(Stack<Integer> st){
        if (st.size() == 1) return;
        int top = st.pop();
        reverse(st);
        PushAtBottom(st,top);
    }

    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        System.out.println(a);
        reverse(a);
        System.out.println(a);
    }
}
