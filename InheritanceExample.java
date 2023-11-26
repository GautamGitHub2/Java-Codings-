package CoreJavaHandsOn;

// 1. Example of Single and Multilevel Inheritance

class A // Parent class
{
    int a;
    void display()
    {
        System.out.println(a);
    }   
}

class B extends A // B is child class
{
    int b;
    void print()
    {
        System.out.println(b);
    }
}

class C extends B
{
    int c;
    void show()
    {
        System.out.println(c);
    }
}


public class InheritanceExample {

    public static void main(String[] args) {

        /* 
        A objA=new A();

        objA.a=100;
        objA.display();//100

        B objB=new B();
        objB.a=10; // This belongs to class A
        objB.b=20; // This belongs to class B
        objB.display(); // This belongs to class A
        objB.print(); // This belongs to class B

         100
         10
         20

        */

        C objC=new C();
        objC.a=10;
        objC.b=20;
        objC.c=30;

        objC.display();//10
        objC.print();//20
        objC.show(); //30

    }
    
}
