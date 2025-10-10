package Stacks;
import java.util.Stack;
public class ReverseStack {

    public static void transfer(Stack<Integer> source, Stack<Integer> destination){
        while(source.size()>0){
            destination.push(source.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);

        Stack<Integer> b = new Stack<>();
        Stack<Integer> c = new Stack<>();
        System.out.println("Original: "+ a);
        transfer(a, b);
        System.out.println(b);
        transfer(b,c);
        System.out.println(c);
        transfer(c,a);
        System.out.println("Reversed: "+a);
    }
}
