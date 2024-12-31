package Arrays;

import java.util.Scanner;

public class CountOfEvenElements {
    public static int count(int[] a){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int [] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Even elements count in array:"+count(arr));
    }
}
// time complexity O(size)