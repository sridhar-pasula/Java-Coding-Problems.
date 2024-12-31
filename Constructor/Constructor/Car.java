package Constructor;

public class Car {
    String brandName;
    double mileage;
    double topSpeed;
    public Car(String brandName,double mileage,double topSpeed){
        this.brandName=brandName;
        this.mileage=mileage;
        this.topSpeed=topSpeed;
    }
    public void travelling(){
        System.out.println("Brand Name is : "+this.brandName);
        System.out.println("Mileage : "+this.mileage);
        System.out.println("Top Speed : "+this.topSpeed);
    }
}
