package ConditionalOperators;

public class Month {
    public static void main(String[] args) {
        String month ="Mar";
        switch(month){
            case "Jan":{
               System.out.println("31 Days in the Month Of January"); 
               break;
            }
            case "Feb":{
                System.out.println("28/29 Days in the month of February"); 
                break;
             }
             case "Mar":{
                System.out.println("31 Days in the month of March"); 
                break;
             }
             case "Apr":{
                System.out.println("30 Days in the month of Apr");
                break; 
             }
             case "May":{
                System.out.println("31 Days in the month of May"); 
                break;
             }
             case "June":{
                System.out.println("30 Days in the month of June"); 
                break;
             }
             case "Jul":{
                System.out.println("31 Days in the month of July"); 
                break;
             }
             case "Aug":{
                System.out.println("31 Days in the month of August"); 
                break;
             }
             case "Sep":{
                System.out.println("30 Days in the month of September"); 
                break;
             }
             case "Oct":{
                System.out.println("31 Days in the month of October"); 
                break;
             }
             case "Nov":{
                System.out.println("30 Days in the month of November"); 
                break;
             }
             case "Dec":{
                System.out.println("31 Days in the month of December");
                break;
             }
             default:{
                System.out.println("Invalid Month");
             }

        }

    }
}
