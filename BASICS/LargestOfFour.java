class LargestOfFour
{
    public static void main(String [] args)
     {
        int a=10,b=20,c=30,d=40;
        System.out.println((a>b)?(a>c?(a>d?a+" is greater":d+" is greater"):(c>d?c+" is greater":d+" is greater")):(b>c)?(b>d?b+" is greater":d+" is greater"):(c>d?c+" is greater":d+" is greater"));
        String e= (a>b)?(a>c?(a>d?a+" is greater":d+" is greater"):(c>d?c+" is greater":d+" is greater")):(b>c)?(b>d?b+" is greater":d+" is greater"):(c>d?c+" is greater":d+" is greater");
        System.out.println(e);
        int f= (a>b)?(a>c?(a>d?a:d):(c>d?c:d)):(b>c)?(b>d?b:d):(c>d?c:d);
        System.out.println(f+" is greater");
        System.out.println("***********************");
        System.out.println(a>b?a+" is Largest":b+" is Largest");
        String g=a>b?a+" is Largest":b+" is Largest";
        System.out.println(g);
        int h=a>b?a:b;
        System.out.println(h+" is Largest");
        System.out.println("*****************");
        System.out.println((a>b)?(a>c?a+" is the largest":c+" is the grater"):(b>c?b+" is greater":c+" is greater"));
        String i= a>b?(a>c? a+" is the largest":c+ " is the largest"):(b>c?b+" is greater": c+" is greater");
        System.out.println(i);
        int j= (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(j+" is the Greater");

     }
}   