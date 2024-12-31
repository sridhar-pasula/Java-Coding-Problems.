class LargestOfTWo{
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println(a>b?a+" is Largest":b+" is Largest");
        String c=a>b?a+" is Largest":b+" is Largest";
        System.out.println(c);
        int d=a>b?a:b;
        System.out.println(d+" is Largest");
    }
}