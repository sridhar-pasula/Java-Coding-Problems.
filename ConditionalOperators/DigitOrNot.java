package ConditionalOperators;

public class DigitOrNot {
    public static void main(String[] args) {
        char c1='8';
        if(c1>='0'&&c1<='9')
        {
            System.out.println(c1+" is a Digit");
        }else {
            System.out.println(c1+" is not a Digit");
        }
    }
}
