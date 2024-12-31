package Arrays;
import java.util.Arrays;
public class MergeTwoArrays {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={5,6,7,8,9};
        int res[]= new int[a.length+b.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            res[k++]=a[i];
        }
        for(int i:b){
            res[k++]=i;
        }
        System.out.println(Arrays.toString(res));
    }
}
