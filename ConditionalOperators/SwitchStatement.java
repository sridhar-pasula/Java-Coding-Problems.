package ConditionalOperators;

public class SwitchStatement {
    public static void main(String[] args) {
        char ch='-';
        if(ch>='a'&& ch<='z' || ch>='A'&& ch<='Z'){
            switch(ch){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    System.out.println(ch+ " is a Vowel");
                    
                }                    
            }else if(ch>='0'&& ch<='9'){
                System.out.println(ch+" is a Digit");
            }else{
                System.out.println(ch+" is a Special Character");
            }
        }
} 