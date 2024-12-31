package Arrays;
import java.util.Arrays;

public class SeggregateZeros {
    public static void main(String[] args) {
        int a[]={4,7,0,9,6,0,1,0,2};
        int res[]= new int[a.length];
        int j=0;
        for(int i=0;i<a.length;i++){
                
                    if(a[i]==0){
                        res[j++]=0;
                        
                    }
                    
                }
        for (int i=0;i<a.length;i++){
            if(a[i]!=0){
                res[j++]=a[i];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
