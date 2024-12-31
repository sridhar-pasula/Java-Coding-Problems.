package Arrays;

import java.util.Arrays;

public class SeggregateEVen {
    public static void main(String[] args) {
        int a[]={4,7,5,9,6,8,1,3,2};
        int res[]= new int[a.length];
        int j=0;
        for(int i=0;i<a.length;i++){
                
                    if(a[i]%2==0){
                        res[j++]=a[i];
                        
                    }
                    
                }
        for (int i=0;i<a.length;i++){
            if(a[i]%2==1){
                res[j++]=a[i];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
