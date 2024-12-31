package Arrays;

import java.util.Scanner;

public class FrequencyOfEachElement { // for only arrays which don't have -1
    public static void  occurance(int[] a){
        int visited=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int count=1;
            if(a[i]!=visited){ // checking element is visited or not 
                // not visited
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        count++;
                        a[j]=visited;
                    }
                }
            System.out.println(a[i]+" : "+ count); 
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int [] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        occurance(arr);
        
    }
}
