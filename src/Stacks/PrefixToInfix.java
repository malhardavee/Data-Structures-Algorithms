package Stacks;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
        String str = "-9/*+5346";

        for (int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if(ascii >= 48 && ascii <= 57) val.push(ch+"");
            else{
                String v1 = val.pop();
                String v2 = val.pop();
                String ans = "("+ v1 +ch + v2 + ")";
                val.push(ans);
            }
        }
        System.out.println("Infix: "+val.peek());
    }
}
