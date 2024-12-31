package Constructor;
 class Circle {
    static double pi=3.14;
    double radius;
    public Circle(double radius){
        this.radius=radius;
        System.out.println(this.radius);
    }
    public Circle(float radius){
        this.radius=radius;

    }
    
    public void areaOfCircle(){
        System.out.println(Circle.pi*(this.radius)*(this.radius));
    }
}
