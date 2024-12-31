package ConditionalOperators;

public class CharacterAnalysis {
    public static void main(String[] args) {
        
        char c1='}';
    
    if(c1>='0'&&c1<='9'){
            System.out.println(c1+" is a Digit");
        }
    if(c1>='a'&&c1<='z'){
            System.out.println(c1+" is an Lower case Alphabet");
        }
    if(c1>='A'&&c1<='Z'){
            System.out.println(c1+" is an Upper  case Alphabet");
        }
    if(!(c1>='0' && c1<='9') && !(c1>='a' && c1<='z') && !(c1>='A' && c1<='Z'))
    {
        System.out.println(c1+" is a Special Charater");
    }
}
}

    