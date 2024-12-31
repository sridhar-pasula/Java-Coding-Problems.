package Recurssion;

public class NumbersFrom1To10 {
    public static void main(String[] args) {
        printNum(1,10); 
    }
    public static void printNum(int m,int n){
       System.out.println(m);
       if(m+1<=n)
        printNum(m+1,n); 
        }
    }


