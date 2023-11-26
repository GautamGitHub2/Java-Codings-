package CoreJavaHandsOn;

//

class Parent // We should not have same class name inside same package
{
    int a;
    void display()
    {
        System.out.println(a);
    }
}

class child1 extends Parent
{
    int x;
    void show()
    {
        System.out.println(x);
    }
}

class child2 extends Parent
{
    int y;
    void print()
    {
        System.out.println(y);
    }
}

public class HierarchyInheritance {
    public static void main(String[] args) {
        
    
    child1 c1=new child1();
    c1.a=100;
    c1.x=200;
    c1.display();//100
    c1.show();//200

    child2 c2=new child2();
    c2.a=300;
    c2.y=400;
    c2.display(); //300
    c2.print(); //400


}

}

/*
 Here every classes are independent we should not write one class inside another class like below...
 this way is completely WRONG we should avoid writing like this...

 Class A
 {
    Class B
    {

    }
 }
*/
