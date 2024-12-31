package Strings;

public class DistinctCharInWord {
   public static void main(String[] args) {
    String s="Hello world";// o/p Helowrd
    String distinct="";
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(!distinct.contains(ch+""))
        distinct+=ch;
         
    }
    System.out.println(distinct);

   } 
}
