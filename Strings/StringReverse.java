package Strings;

public class StringReverse {
    public static void main(String[] args) {
        String s="Hello";
    System.out.println(reverse(s));
    System.out.println(reverseMethod2(s));
    }
    public static String reverse(String s){
        String rev="";
        for(int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;

        }
        
        return rev;
    }     
    public static String reverseMethod2(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);

        }
        return rev;
    }


}
