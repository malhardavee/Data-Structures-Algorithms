package Stacks;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String s = "9-(5+3)*4/6"; String t;
        System.out.println(s);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            // 0 -> 48 and 9 -> 57
            if ((int)ch >= 48 && (int)ch <= 57){
                t = "" + ch;
                val.push(t);
            }
            else if (op.size() == 0 || ch == '(' || op.peek() == '(')
                op.push(ch);
            else if (ch == ')'){
                while (op.peek() != '('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String ans = o + v1 + v2;
                    val.push(ans);
                }
                op.pop(); // '(' hata diya
            }
            else{
                if (ch == '+' || ch == '-'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String ans = o + v1 + v2;
                    val.push(ans);
//                    push after work
                    op.push(ch);
                }
                if (ch == '*' || ch == '/'){
                    if (op.peek() == '+' || op.peek() == '-') op.push(ch);
                    else{
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String ans = o + v1 + v2;
                        val.push(ans);
//                        push
                        op.push(ch);
                    }
                }
            }
        }
//        val stack -> size > 1
        while (val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String ans = o + v1 + v2;
            val.push(ans);
        }
        String prefix = val.pop();
        System.out.println(prefix);
    }
}
