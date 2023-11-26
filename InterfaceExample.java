package CoreJavaHandsOn;

interface ABC
{
    int a=10; // In interface by default variables are static, no need to write static & final keyword explicitly and in italic representation
    
    void m1(); // abstract method, by default public
}

public class InterfaceExample implements ABC
{
    public void m1() //Error is coming because public method of the interface 'A' is now default inside the class, so to run / perform this code / program smoothly we keep public keyword for the method
    {
        System.out.println(a);
    }

    /*
     m1() in CoreJavaHandsOn.InterfaceExample cannot implement m1() in CoreJavaHandsOn.A
     attempting to assign weaker access privileges; was public(compiler.err.override.weaker.access)
     Cannot reduce the visibility of the inherited method from A 
     
    public    --> Higher Access Modifier
    default   -->
    protected -->
    private   --> Lower Access Modifier
    */
    public static void main(String [] args) 
    {
        InterfaceExample ie=new InterfaceExample();
        ie.m1(); //10

        ABC abc=new InterfaceExample(); // Here variable used for Interface but the initialization/instantiation from Class; this will create the memory and 'abc' will point to that memory/ because interface by default doesnot have the memory location and class also doesnot have memory location until and unless its object is created.
        abc.m1(); //10
        
    }
    
}