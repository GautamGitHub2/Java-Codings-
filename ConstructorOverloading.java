package CoreJavaHandsOn;

public class ConstructorOverloading {

    ConstructorOverloading(int a, int b)
    {
        System.out.println(a+b);
    }

    ConstructorOverloading(int a, double b)
    {
        System.out.println(a+b);
    }

    ConstructorOverloading(double a, int b)
    {
        System.out.println(a+b);
    }

    ConstructorOverloading(double a, double b)
    {
        System.out.println(a+b);
    }

    ConstructorOverloading(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }

    ConstructorOverloading(double a, double b, double c)
    {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {

        ConstructorOverloading con=new ConstructorOverloading(10, 20); // 1. int int 30

        ConstructorOverloading con0=new ConstructorOverloading(10, 20.43); //2. int double 30.43

        ConstructorOverloading con1=new ConstructorOverloading(10.87, 20);//3. double int 30.869999999999997

        ConstructorOverloading con2=new ConstructorOverloading(10.76, 20.98); //4. double double 31.740000000000002

        ConstructorOverloading con3=new ConstructorOverloading(10, 20, 49); //5. int int int 79

        ConstructorOverloading con4=new ConstructorOverloading(10.32, 20.43,56.67); //6. double double double 87.42
        
        
    }
    
}
