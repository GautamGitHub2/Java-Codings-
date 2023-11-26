package CoreJavaHandsOn;

public class Student {
    
    int sid;
    String sname;
    char grade;

    void display()
    {
        System.out.println(sid+"  "+sname+"  "+grade);
    }

    void getValues(int id,String name, char g)// this method will take parameters from the main method
    {
        sid=id;
        sname=name;
        grade=g;
    }

    Student(int id,String name, char g)// this is a constructor and it will take parameter from the main method, main StudentMain class
    {
        sid=id;
        sname=name;
        grade=g;
    }
}
