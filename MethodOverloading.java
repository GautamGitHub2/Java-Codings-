package CoreJavaHandsOn;

public class MethodOverloading {

    void add(int a, int b)
    {
        System.out.println(a+b);
    }

    void add(int a, double b)
    {
        System.out.println(a+b);
    }

    void add(double a, double b)
    {
        System.out.println(a+b);
    }

    void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }

    void add(double a, int b)
    {
        System.out.println(a+b);
    }

    public static void main(String [] args) {

        MethodOverloading m=new MethodOverloading();

        System.out.println("*** Example of Method Overloading is: ***");

        m.add(10, 20); //int int 30
        m.add(30, 40.45); //int double 70.45
        m.add(45.32, 55.67);//double double 100.99000000000001
        m.add(45, 76, 78);//int int int 199
        m.add(43.56, 21);//dobule int   64.56     
    }

    
}
