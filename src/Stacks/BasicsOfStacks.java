package Stacks;

import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println("size of stack: "+st.size());
        st.push(11);
        System.out.println("size of stack: "+st.size());
        st.push(22);
        System.out.println("size of stack: "+st.size());
        st.push(33);
        System.out.println("size of stack: "+st.size());
        st.push(44);
        System.out.println("size of stack: "+st.size());
        st.push(55);
        System.out.println("size of stack: "+st.size());
        System.out.println(st.isEmpty());
        // peek
//        System.out.println(st.peek());
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        System.out.println("size of stack: "+st.size());
//        while (st.size()>1){
//            st.pop();
//        }
//        System.out.println(st.peek());
    }
}
