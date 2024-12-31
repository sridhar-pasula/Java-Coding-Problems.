package Inheritance;

class A{
    static int count=0;
A(){
     count++;
}
}
class B extends A{
B(){
super();
}
}
class C extends B{
C(){
super();
}
}
class D extends C{
D(){
super();
}
}
public class multiple {
    public static void main(String[] args) {
        A obj1= new A();
        B obj2= new B();
        C obj3 = new C();
        D obj4= new D();
        A obj5= new A();
        D obj6= new D();

        System.out.println(obj1.count);
    }
}
