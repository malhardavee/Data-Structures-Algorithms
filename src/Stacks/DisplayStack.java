package Stacks;

import java.util.Stack;

public class DisplayStack {
    public static void displayReverseRec(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRec(st);
        st.push(top);
    }

    public static void displayRec(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }

    public static void PushAtBottom(Stack<Integer> st, int target){
        if(st.size() == 0){
            st.push(target);
            return;
        }
        int top = st.pop();
        PushAtBottom(st, target);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayReverseRec(st);
        System.out.println();
        displayRec(st);
        System.out.println();
        PushAtBottom(st, 0);
        System.out.println(st);
//        Stack<Integer> rt= new Stack<>();
//        while (st.size()>0){
//            System.out.print(st.peek()+" ");
//            rt.push(st.pop());
//        }
//        System.out.println();
//        while (rt.size()>0){
//            int x = rt.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }
//        int n = st.size();
//        int[] arr = new int[n];
//        for (int i=n-1;i>=0;i--){
//            arr[i] = st.pop();
//        }
//
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//            st.push(arr[i]);
//       }
    }
}
