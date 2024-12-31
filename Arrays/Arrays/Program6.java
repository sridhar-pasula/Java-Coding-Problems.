// question: return a new array which gives product of all 
//elements other than that particular position element
//(i.e except ith element) ex: if we are in second index we need 
// product of all elements the element at second index
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Program6 {
    public static int[] product(int [] arr){
        int [] res= new int[arr.length];
    //     for(int i=0;i<arr.length;i++){
    //         int pro=1;
    //         for(int j=0;j<arr.length;j++){
    //             if(i!=j){
    //         pro= pro*arr[j];
    //             }
    //             res[i]=pro;
    //         }
    //     }
    //     return res;
    // } 
 // Another logic for better time complexity
        int pro=1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                pro=pro*arr[i];
            
            }else{
                count++;
            }
        }
        if(count>1){// for more than ne xero in the array
            for(int i=0;i<arr.length;i++){
                res[i]=0;
            }
        }
       else if(count==0){ // for no zeroes in array
            for(int i=0;i<arr.length;i++){
                res[i]=pro/arr[i];
           }
        }else{// for one zero in the array
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    res[i]=pro;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(product(arr)) );
    }
}
