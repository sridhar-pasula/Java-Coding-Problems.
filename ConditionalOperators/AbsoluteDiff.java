package ConditionalOperators;

public class AbsoluteDiff {
    public static void main(String[] args) {
        
    
    int a=10,b=-10,a1=0,b1=0;
    if(a>0)
    {
        a1=a-0;
    }else{
        a1=0-a;
    }
    if (b>0)
    b1=b-0; 
    else
    b1=0-b;
    if(a1==b1){
        System.out.println(a+" and "+b+" both are equi distance to zero");
    }
    else{
    if(a1>b1){
    System.out.println(b+"is near to zero");
    }else{
    System.out.println(a+"is near to zero");
}
}
}
}