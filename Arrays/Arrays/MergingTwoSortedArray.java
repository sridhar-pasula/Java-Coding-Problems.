package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergingTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a1 size: ");
        int size1= sc.nextInt();
        int [] a1= new int[size1];
        System.out.println("enter "+size1+" elements of a1: ");
        for(int i=0;i<size1;i++){
            a1[i]=sc.nextInt();
        }
        System.out.println("enter a2 size: ");
        int size2= sc.nextInt();
        int [] a2= new int[size2];
        System.out.println("enter "+size2+" elements of a2: ");
        for(int i=0;i<size2;i++){
            a2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(merge(a1,a2)));
    }
    private static int[] merge(int[] a1, int[] a2) {
        int a[]= new int[a1.length+a2.length];// new array stores sorted array of size of sum of length of two arrays
        int i=0,j=0,k=0;
        while(i<a1.length&&j<a2.length){// compare elemts of a1[i] with a2[j] and copy the smaller element to a[k]
            if(a1[i]<a2[j]){
                a[k++]=a1[i++];
            }else{
                a[k++]=a2[j++];
            }
        }
       while(i<a1.length){// to copy remaining elements from a1
        a[k++]=a1[i++];
       }
       while (j<a2.length){// to copy remaining elements from a2
        a[k++]=a2[j++];
       }
        return a;
    }
}
