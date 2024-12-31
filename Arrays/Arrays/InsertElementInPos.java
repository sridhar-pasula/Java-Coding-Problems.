package Arrays;

import java.util.Arrays;

public class InsertElementInPos {
    public static void main(String[] args) {
        int a[]={9,3,2,8,7,0};
        int ele=4;
        
        int pos=0;
        int res[]= new int[a.length+1]; 
        if(pos<=0 || pos>a.length+1){
            System.out.println("insertion not possible");
        }else{
        for(int i=0,ind=0; i<res.length;i++){
            
            if(i==pos-1){
                res[i]=ele;
            }
            else{
                res[i]=a[ind++];
            }
            
        }
    
        System.err.println(Arrays.toString(res));
    }
    }
}
