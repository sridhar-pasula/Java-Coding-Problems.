package Recurssion;

public class product {
    public static void main(String[] args) {
        int n=pro(1,7);
        System.out.println(n);
    }
    public static int pro(int m,int n ){
        if(m==n){
            return n;
        }else{
        return m*pro(m+1,n);
        }
    }
}
