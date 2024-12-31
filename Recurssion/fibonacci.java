package Recurssion;

public class fibonacci {
    public static void main(String[] args) {
        int m=0,n=1;
        System.out.println(m);
        System.out.println(n);
        fib(m, n);
    }
    public static void fib(int a,int b){
        int c=a+b;
        if(c<=100){
            System.out.println(c);
            fib(b, c);
        }
    }
}
