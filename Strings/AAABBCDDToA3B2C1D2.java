package Strings;

public class AAABBCDDToA3B2C1D2 {
    public static void main(String[] args) {
        String s="aaabbcdd";
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){  
                if(s.charAt(i)==s.charAt(j)&&i>j){
                    break;   
                }
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }  
            }
                if(count> 0){
                    System.out.print(s.charAt(i)+""+count);
                }
        }
    }
}
