package CoreJavaHandsOn;

class Teacher
{
    String designation = "Teacher";
    String collegename = "Beginnersbook";

    void does()
    {
        System.out.println("**** Teaching ****");
    }
}

class ComputerTeacher extends Teacher
{
    String designation = "Computer Teacher";
    String collegename = "Beginnersbook";

    void does()
    {
        super.does();//**** Teaching ****
        System.out.println("**** Teaching Computer Science ****");
    }

}


public class InheritanceAssignment {

    public static void main(String []args) {

        ComputerTeacher ct=new ComputerTeacher();
        
        System.out.println(ct.designation);//Computer Teacher
        System.out.println(ct.collegename);//Beginnersbook
        
        ct.does();//**** Teaching Computer Science ****
        
    }
    
}
