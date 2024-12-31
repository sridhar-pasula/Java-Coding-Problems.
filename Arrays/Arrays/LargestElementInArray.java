package Arrays;

import java.util.Scanner;

public class LargestElementInArray {

    public static int largestElement(int[] a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int [] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Largest element in array:"+largestElement(arr));
    }
}
// Time complexity O(n-1)
