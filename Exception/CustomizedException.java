package Exception;

public class CustomizedException {
    public static void main(String[] args) {
        Employee emp= new Employee();
        emp.id=420;
        emp.name="Nagarjuna";
        System.out.println("hi");
        try{
        emp.setSal(10000);
        }
        catch(LowSalaryException e){
            System.out.println(e);
            emp.setSal(20000);
        }
        emp.display();
        System.out.println("bye");
    }
}
