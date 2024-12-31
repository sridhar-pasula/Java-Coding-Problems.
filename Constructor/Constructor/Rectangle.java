package Constructor;

public class Rectangle {
    double length;
    double bredth;

    public Rectangle(double length,double bredth){
        this.length=length;
        this.bredth=bredth;
    }
    public void areaOfRectangle(){
        System.out.println(this.length*this.bredth);
    }
}

