package CoreJavaHandsOn;

public class StudentMain {

    public static void main(String[] args) {

        Student stu1=new Student(103,"Manu",'A');// here error will come if i not assign the parameter, since with the help of the constructor 'Student' it will be invoked automatically and since the constructor contains the 3 parameter so i have to assign 3 parameteres here during the object creation.
/*
        //1. Assign values by using reference variable
        
        System.out.println("*** Assign values by using reference variable ***");

        stu1.sid=101;
        stu1.sname="Gautam";
        stu1.grade='A';
        
        stu1.display();

        
        *** Assign values by using reference variable ***
        101  Gautam  A
        */
        
        /*
        //2. Assign values by using method

        System.out.println("Assign values by using method");

        stu1.getValues(102, "Nitoo", 'B');
        stu1.display();
        
        Assign values by using method
        102  Nitoo  B
        */

        //2. Assign values by using constructor

        System.out.println("Assign values by using constructor");
        stu1.display();

        /*
        Assign values by using constructor
        103  Manu  A
        */




    }
    
}
