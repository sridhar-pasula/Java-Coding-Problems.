package Constructor;

public class CarDriver {
    public static void main(String[] args) {
        Car c1= new Car("BMW", 10.5, 240);
        c1.travelling();
        System.out.println("_-_-_-_-_-_-_-_-_-");
        Car c2= new Car("Volvo", 11.9, 240);
        c2.travelling();

    }
}
