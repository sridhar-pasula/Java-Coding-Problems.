class LargestOfThree
{
    public static void main(String [] args)
     {
        int a=10,b=20,c=30;
        System.out.println((a>b)?(a>c?a+" is the largest":c+" is the grater"):(b>c?b+" is greater":c+" is greater"));
        String d= a>b?(a>c? a+" is the largest":c+ " is the largest"):(b>c?b+" is greater": c+" is greater");
        System.out.println(d);
        int e= (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(e+" is the Greater");


     }
} 