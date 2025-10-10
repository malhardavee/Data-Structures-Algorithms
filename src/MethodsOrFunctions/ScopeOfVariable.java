package Methods;

public class ScopeOfVariable {
    static int i; // INITIALIZING GLOBAL VARIABLE

    public static void fun(){
        i = 45;
        System.out.println(i);
        int i = 18; // LOCAL VARIABLE
    }

    public static void main(String[] args) {
        i = 16;
        fun();
        int i = 23; // LOCAL VARIABLE
        System.out.println(i);
        fun();
        System.out.println(i);
    }
}
