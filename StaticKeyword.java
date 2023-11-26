package CoreJavaHandsOn;

public class StaticKeyword {

    /*
     1. Static Variables
     2. Static Methods
     -------------------
     * Static keyword / method can access only static stuff (directly means without creating object, for this we do not need to create object)
     * Static methods can also access static stuff but through object
     * Non static methods can access both static & non-static stuff directly
     * Always object is created inside the main method not inside the normal method
    
     */
    
    static int a=10; // static variable
    int b=20; // non-static variable

    static void m1()// static method
    {
        System.out.println(" This is static method");
    }

    void m2() // Non-static method
    {
        System.out.println("This is non-static method");
    }

    void m3() // non-static method
    {
        System.out.println("This is m3 method ---- non-static----");
        System.out.println(a);// static variable
        System.out.println(b);//non-static variable
        m1();// static method
        m2();// Non-static method
    }

    public static void main(String[] args) {

        //Static methods can also access static & non-static stuff but through object

       StaticKeyword stk=new StaticKeyword();
       stk.m1();//This is static method ; warning:The static method m1() from the type StaticKeyword should be accessed in a static way
       System.out.println(stk.a);//10 ; warning:The static method m1() from the type StaticKeyword should be accessed in a static way

       // static methods can access only static stuff

        StaticKeyword.m1(); //This is static method / here we can access static methods directly without creating class object, we can access static methods with help of the class name only
        System.out.println(a);//10
        m1();//This is static method 

        // we cannot access non-static variables or methods directly inside the static method, it will give error like: non-static method m2() cannot be referenced from a static 
        
        /* 
        System.out.println(b);//non-static variable b cannot be referenced from a static context
        m2();//non-static method m2() cannot be referenced from a static 
        StaticKeyword.m2();//Cannot make a static reference to the non-static method m2() from the type StaticKeyword
        for accessing non-static variable & methods we have to use object ref. variable
        */
       stk.m2();//This is non-static method
       System.out.println(stk.b);//20
       
       //Non static methods can access both static & non-static stuff directly

        stk.m3();
        /*
        This is m3 method ---- non-static----
        10
        20
        */
        
    }

    
}
