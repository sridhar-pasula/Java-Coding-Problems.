package ConditionalOperators;

public class Time {
    public static void main(String[] args) {
        int time=22;
        switch(time){
            case 1:
            case 2:
            case 3:
            case 4:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            System.out.println("Good Night");
            break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            System.out.println("Good Morning");
            break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            System.out.println("Good AfterNoon");
            break;
            case 17:
            case 18:
            case 19:
            System.out.println("Good Evening");
            break;
            default:
            System.out.println("Invalid Time");
        }
    }
}
