package ConditionalOperators;

public class SpecialCharOrNot {
    public static void main(String[] args) {
        char c1='#';
        if(c1>=' '&&c1<='/'||c1>=':'&&c1<='@'||c1>='['&&c1<='_'||c1>='{'&&c1<='}'){
            System.out.println(c1+" is an Special Character");
        }else{
            System.out.println(c1+" is not a special Character");
        }
    }
}
