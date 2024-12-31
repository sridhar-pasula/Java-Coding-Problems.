package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemovingSpecifiedElement {
    public static int [] removeElement(int [] a, int val){
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!= val){
                a[j++]=a[i];
            }
        }
        a=Arrays.copyOf(a,j);
        return a;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int val=sc.nextInt();
        int [] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

       System.out.println(Arrays.toString( removeElement(arr,val)));
    }
}
