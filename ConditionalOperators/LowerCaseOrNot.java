package ConditionalOperators;

public class LowerCaseOrNot {
    public static void main(String[] args) {
        char c1='8';
        
        if(c1>='a'&&c1<='z'){
            System.out.println(c1+" is an Lower case Alphabet");
        }else{
            System.out.println(c1+" is not a lower case Alphabet");
        }
    }
}
