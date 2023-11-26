package CoreJavaHandsOn;

public class Animal // Parent Class 
{
    String color ="White"; // immediate / instance variable of parent class
    
    void eating()
    {
        System.out.println("....Eating....");
    }

    // Parent Class Constructor 

    Animal()
    {
        System.out.println("**** This is Animal Constructor ****");
    }
}

class Dog extends Animal // Child / Sub-Class Class 
{
    //public static void main(String [] args){} of this class is available inside SuperKeyword.java kindly have a look there
    
    String color = "Black"; //here i have changed the color value, means overriding the existing/parent property 
    
    void displayColor()
    {
        System.out.println(color);

        //Super Keyword
        System.out.println(super.color); // White, 
    }

    void eating()
    {
        System.out.println("....Eating Bread and Drinking Water....");//....Eating Bread and Drinking Water....
        super.eating(); //....Eating....
    }

    // Child Class Constructor 

    Dog()
    {   
        super(); // super() method will always be the first statement inside the sub-class/child constructor// this will invoke parent class constructor// before running this code/program for super() that is for parent class constructor just comment "//" the child class object ref. variable wherever it has been used in the code then we can she the use of super() otherwise it will be difficult to identify the use of super() 
        System.out.println(" **** This is Dog Constructor **** ");

        /*
        **** This is Animal Constructor ****
        **** This is Dog Constructor **** 
        */
        
    }
}


