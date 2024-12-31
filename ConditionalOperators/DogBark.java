package ConditionalOperators;

class DogBark {
    public static void main(String[] args) {
        float time=25f;
        boolean bark=true;
        if(bark==true){
            if(time>24||time<0){
                System.out.println("invalid Time.Check and Re-enter between (0-24)");
            }
        else{
        if((time>5&&time<19)){
            System.out.println("we are safe");
        }else {
            System.out.println("we are  in trouble");
        }
        }}else{
            System.out.println("we are safe");
        }
    }
}

