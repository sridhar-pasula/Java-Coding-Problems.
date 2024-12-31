package Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int a[]={2,5,7,3,4,9,11,15,12,3,9,10};
        int f1=0,f=-1,l=-1,c=1,mc=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1]){
                c++;
            }
            else{
                c=1;
                f1=i+1;
            }
                if(c>mc){
                mc=c;
                f=f1;
                l=i+1;
                }
            }  
        System.out.println(mc);
        for(int i=f;i<=l;i++){
            System.out.print(a[i]+" ");
        }
    }

}