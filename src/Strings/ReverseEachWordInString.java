package Strings;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str = "I am an online educator";
        String ans = "";
        StringBuilder s = new StringBuilder();
        System.out.println(str);
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                s.append(ch);
            }
            else{
                ans += s.reverse() + " ";
                s.delete(0,s.length());
            }
        }
        ans += s.reverse();
        System.out.println(ans);
    }
}
