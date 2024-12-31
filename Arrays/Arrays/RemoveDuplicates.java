package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr){
        // Step1: Create new array 
        int [] res= new int[arr.length];
        //step2: copy first element
        res[0]=arr[0];
        //Step 3: create k and initialize 1
        int k=1;
        // step 4: insert remainig unique elements

        for(int i=1;i<arr.length;i++){
            // step: 4.1 check if ith element is present in result
            // compare ith element in the res till k
            int j=0;
            for( ;j<k;j++){
                if(arr[i]== res[j]){
                    break;
                }
                
            }
            if(j==k){
                res[k]=arr[i];
                k++;
            }
        }
        // to trim the array 
        int [] b= new int[k]; // or we can use copyOf() 

        for(int i=0;i<k;i++){
            b[i]= res[i];
        }
      //  res =Arrays.copyOf(res,k); another way of trimming
        return b;
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

