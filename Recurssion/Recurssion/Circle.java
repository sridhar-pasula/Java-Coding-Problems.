package Recurssion;


class AreaOfCircle{
 
    public static double areaOfCircle(double pi, int r){ // method declaration  method signtature
        // function defination
        
        double area;
        area=pi*r*r;
        return area; 
    }
    public static void main(String[] args) {
        double pi=3.14;
        System.out.println("uday");
        System.out.println(areaOfCircle(pi,10));// method calling statement //
        System.out.println("hello");
    }
}