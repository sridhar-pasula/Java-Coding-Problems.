package Exception;

public class Employee {
    int id;
    String name;
    private double sal;
    
    public double getSal(){
        return sal;
    }
    public void setSal(double sal){
        if(sal>20000){
            this.sal=sal;
        }else{
            throw new LowSalaryException("The given sal is less then the basic salary ");
        }
    }
    public void display(){
        System.out.println("Id : "+ id);
        System.out.println("name : "+ name);
        System.out.println("Salary : "+ sal);
    }
}
