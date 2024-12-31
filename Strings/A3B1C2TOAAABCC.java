package Strings;

public class A3B1C2TOAAABCC {
    public static void main(String[] args) {
        String s="a3b1c2";// o/p aaabcc
        String res="";
        for(int i=0;i<s.length();i++){
            if(i%2==1){
                int n=Integer.parseInt(s.charAt(i)+"");
                char ch =s.charAt(i-1);
                for(int j=1;j<=n ;j++ ){
                    res+=ch;
                }
            }
        }
        System.out.println(res);
    }
}
