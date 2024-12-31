package Arrays;

public class twoDArray {
    public static void main(String[] args) {
        int a[][]={{0,1,0,0},{0,0,1,1},{1,0,1,1},{1,1,1,1}};
        int row=0,max=0;
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0; j<a[i].length;j++){
                if(a[i][j]==1){
                    c++;
                }
                
            }
            if(c>max){
                max=c;
                row=i+1;
              }
        
        }
        System.out.println(row);
        System.out.println(max);
    }
}
