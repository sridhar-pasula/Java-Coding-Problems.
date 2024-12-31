package Strings;

/**
 * AllPossiblePalindromesInString
 */
public class AllPossiblePalindromesInString {

    public static boolean palindrome(String s){
        String rev="";
        for(int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
        }
        return rev.equals(s);
    }
    public static void main(String[] args) {
        String s="abakj12321jkakhiabai";
        for(int i=0;i<s.length();i++){
            String s1=s.charAt(i)+"";
            for(int j=i+1;j<s.length();j++){
                s1=s1+s.charAt(j);
                if(palindrome(s1)){
                    System.out.println(s1);
                }
            }
        }
    }
}