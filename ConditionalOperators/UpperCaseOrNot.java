package ConditionalOperators;

public class UpperCaseOrNot {
    public static void main(String[] args) {
        char c1='8';
        if(c1>='A'&&c1<='Z'){
            System.out.println(c1+" is an Upper  case Alphabet");
        }else {
            System.out.println(c1+" is not an upper case Alphabet");
        }
    }
}
