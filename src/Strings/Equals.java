package Strings;

public class Equals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1 == s3); // it sees different addresses for both the strings
        System.out.println(s1.equals(s3)); // it compares the characters of the strings


    }
}
