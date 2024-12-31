package Strings;

public class P2 {
    public static void main(String[] args) {
        String s="abcdefgh";
        int k= s.length()/2;
        for(int i=0;i<s.length();i++){
            if(k==s.length())
            k=0;
            System.out.print(s.charAt(k++));
        }
    }
}
