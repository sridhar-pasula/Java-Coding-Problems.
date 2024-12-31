package Strings;

public class LongestWord {
    public static void main(String[] args) {
        String s="this is a Programming  class";
        String [] s1= s.split(" ") ;
        String max="";
        for(String s2:s1){
            if(s2.length()>max.length()){
                max=s2;
            }
        }
        System.out.println(max);
    }
}
