package Strings;

public class Occurance {
    public static void main(String[] args) {
        String s="mathematics";
        String d="";
        for(int i=0;i<s.length();i++){
            int count=0;
            char ch=s.charAt(i);
            for(int j=i;j<s.length();j++){
                if(ch==s.charAt(j)){
                    count++;
                }
            }
            if(!d.contains(ch+"")){
                d=d+ch;
                System.out.println(ch+"->"+count);
            }
        }
    }
}
