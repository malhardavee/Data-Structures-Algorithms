package MethodsOrFunctions;

public class ReturnType {

    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        int x = sum(5,9);
        System.out.println(x);
        System.out.println("Sum = "+sum(2,8));
    }
}
