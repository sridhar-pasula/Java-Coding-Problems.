package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesInSortedArray {
    public static int[] removeDuplicates(int[] arr){
        // Step1: Create new array 
        int [] res= new int[arr.length];
        //step2: copy first element
        res[0]=arr[0];
        //Step 3: create k and initialize 1
        int k=0;
        for(int i=1;i<arr.length;i++){
                if(arr[i]>res[k]){
                    res[++k]=arr[i];  
                }
        }
        // to trim the array 
       // int [] b= new int[k]; // or we can use copyOf() 

        //for(int i=0;i<k;i++){
        //    b[i]= res[i];
       // }
        res =Arrays.copyOf(res,k+1); //another way of trimming
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int [] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println(Arrays.toString( removeDuplicates(arr))); 
    }
}
