package Strings;

public class Reverse {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("physics");
        int i = 0, j = s.length() - 1;
        System.out.print(s+" ");
        while (i < j){
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j,temp);
            i++; j--;
        }
        System.out.println(s);

        ///  using inbuilt function
        StringBuilder sb = new StringBuilder("maths");
        System.out.print(sb+" ");
        sb.reverse();
        System.out.println(sb);
    }
}
