package MethodsOrFunctions;

public class MoreAboutMethods {

    public static void first(){
        second();
        for (int i =1; i<=10;i++)
            System.out.print(i+" ");
        System.out.println();
        third();
    }

    public static void second(){
        System.out.println("Hi, Good Morning");
    }

    public static void third(){
        System.out.println("How are you ?");
    }

    public static void main(String[] args) {
        System.out.println("Yo Yo");
        first();
        System.out.println("Gian");
        second();
        third();
    }

}
