package Recurssion;

public class sum {
    public static void main(String[] args) {
        int n=summation(1,10);
        System.out.println(n);
    }
    public static int summation (int m, int n){
       
        if(m==n){
            return n;
        }else{
        return m+summation(m+1,n);
        }
    }
}
