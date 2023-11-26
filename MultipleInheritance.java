package CoreJavaHandsOn;

interface ABCD
{
    int x=100;
    void m1();
}

interface XYZ
{
    int y=200;
    void m2();
}

public class MultipleInheritance implements ABCD, XYZ
{
    public void m1()
    {
        System.out.println(x);
    }

    public void m2()
    {
        System.out.println(y);
    }

    public static void main(String args[]) {

        MultipleInheritance mi=new MultipleInheritance();
        mi.m1(); //100
        mi.m2(); //200
        
    }
    
}
