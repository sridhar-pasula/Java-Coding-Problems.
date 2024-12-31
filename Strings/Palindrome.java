package Strings;

public class Palindrome    {
    public static void main(String[] args) {
        String s="The level of malayalam is difficult dad";
        String [] s1= s.split(" ") ;
        for(int i=0; i<s1.length;i++){
            if(isPalindrome(s1[i]))
                System.out.println(s1[i]);
        }
    } 
    public static boolean isPalindrome(String s1){// palindrome logic 
         String rev="";
         for(int i=0;i<s1.length();i++){
             rev=s1.charAt(i)+rev; 
         }
         if(s1.equals(rev))
             return true;
         else
             return false;
    } 
}
