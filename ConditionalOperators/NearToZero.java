package ConditionalOperators;

public class NearToZero {
    public static void main(String[] args) {
        int a=10,b=-15;
        if(a-b>b-a){
            System.out.println(b+"is near to zero");

        }else{
            System.out.println(a+" is near to zero");
        }
    }
}
