package ConditionalOperators;

public class DivBy3Or4 {
    public static void main(String[] args) {
    int num=12;
        
            if(num%3==0&&num%4!=0){
                System.out.println("good Morning");
            }
            if (num%4==0&num%3!=0)
            {
                System.out.println("good Afternoon");
            }
            if(num%3==0&&num%4==0)
            {
                System.out.println("good evening");
            }
            if(num%3!=0&&num%4!=0){
                System.out.println("good Night");
            }
        }
    
}



