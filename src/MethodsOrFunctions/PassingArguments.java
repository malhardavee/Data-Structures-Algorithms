package MethodsOrFunctions;

public class PassingArguments {

    public static void greet(String name){
        System.out.println("Good Morning "+name);
    }

    public static void main(String[] args) {
        sum(70,-17, 47);
        greet("Alakh Pandey");
        intro("Nistha",25);
        Student("Jiya",21,"B.Com",'A');
    }

    public static void sum(int a, int b, int c){
        System.out.println("Sum is: "+(a+b+c));
    }

    public static void intro(String name, int age){
        System.out.println("Hello "+name+" your age is: "+age);
    }

    public static void Student(String name, int age, String Class, char grade){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Class: "+Class);
        System.out.println("Grade: "+grade);
    }
}
