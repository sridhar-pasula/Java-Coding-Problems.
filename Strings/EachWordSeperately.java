package Strings;

public class EachWordSeperately {
    public static void main(String[] args) {
        String s="this is a class";
        String [] s1= s.split(" ") ;
        for(int i=0; i<s1.length;i++){
            System.out.println(s1[i]);
        }
    }
}
