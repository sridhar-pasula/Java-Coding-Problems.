package Strings;

public class P3 {
    public static void main(String[] args) {
        String s="abcdefgh";
        System.out.println(toggle(s));//even index position in upper case and odd postions in lower case
        System.out.println(evenOdd(s));// Even index position first 
        System.out.println(secondFirst(s));// second half first and next first half
        System.out.println(halfRev(s));
        System.out.println(halfRev2(s));
        
    }
    public static String toggle(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i%2==0){
                res=res+(ch+"").toUpperCase();
            }
            else{
                res+=(ch+"").toLowerCase();
            }
        }
        return res;
    }
    public static String evenOdd(String s){
        String e="",o="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                e+=s.charAt(i);
            }else{
                o+=s.charAt(i);
            }
        }
        return e+o;
    }
    public static String secondFirst(String s){
        String f="",se="";
        for(int i=0;i<s.length();i++){
            if(i<s.length()/2){
                f+=s.charAt(i);
            }else{
                se+=s.charAt(i);
            }
        }
        return se+f;
    }
    public static String halfRev(String s){
        String f="",se="";
        for(int i=0;i<s.length();i++){
            if(i<s.length()/2){
                f=s.charAt(i)+f;
            }else{
                se=s.charAt(i)+se;
            }
        }
        return f+se;    
    }
    public static String halfRev2(String s){
        String f="",se="";
        for(int i=0;i<s.length();i++){
            if(i>=s.length()/2){
                f=s.charAt(i)+f;
            }else{
                se=se+s.charAt(i);
            }
    }
    return f+se;

}
}
