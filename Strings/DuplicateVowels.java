package Strings;

public class DuplicateVowels {
    public static void main(String[] args) {
        String s="abaaebcikiUUAA";
        String vowel="aeiouAEIOU", d="";

        for(int i=0;i<s.length();i++){
            int count=0;
            char ch= s.charAt(i);
            if(vowel.contains(ch+"")){
            for(int j=i;j<s.length();j++){
                if(ch==s.charAt(j))  {
                    count++;
                }
        }
        if(!d.contains(ch+"")&& count>1){
            d=d+ch;
            System.out.println(ch);
        }
    }
    }
}
}
