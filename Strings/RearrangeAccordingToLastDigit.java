package Strings;

import java.util.Arrays;

public class RearrangeAccordingToLastDigit {
    public static void main(String[] args) {
        String s="HTML4 CSS5 JAVA1 C#3 PYTHON2";
        String[] s1= s.split(" ");
        String s2[]=new String[s1.length];
        
        for(int i=0;i<s1.length;i++){
            //String k=s1[i];
           // int lastIndex=k.length()-1;
         //   int n= Integer.parseInt(k.charAt(li)+"");
         //s2[n-2]=s1[i].substring(0,li);
            int n=Integer.parseInt(s1[i].charAt(s1[i].length()-1)+"");
            s2[n-1]=s1[i].substring(0,s1[i].length()-1);
        }
        System.out.println(Arrays.toString(s2));

    }
}
