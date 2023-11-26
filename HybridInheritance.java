package CoreJavaHandsOn;

class A1
{
    void m1()
    {
        System.out.println("This is m1 method from class A1");
    }
}

interface I1
{
    void i1();
}

interface I2
{
    void i2();
}

public class HybridInheritance extends A1 implements I1, I2 
{
    public void i1()
    {
        System.out.println("This is i1() method from I1 interface");
    }

    public void i2()
    {
        System.out.println("This is i2() method from I2 interface");
    }
    public static void main(String [] args) {

        HybridInheritance hi=new HybridInheritance();
        hi.i1(); //This is i1() method from I1 interface
        hi.i2(); //This is i2() method from I2 interface
        hi.m1(); //This is m1 method from class A1
        
    }

    
}
