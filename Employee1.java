package CoreJavaHandsOn;

public class Employee1 {
    int eid;
    String ename,dept,org;
    double salary;

    void display()
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(dept);
        System.out.println(org);
        System.out.println(salary);
    }

    void getEmployeeData(int eid,String ename,String dept,String org,double salary)
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(dept);
        System.out.println(org);
        System.out.println(salary);
    }

    //Constructor

    Employee1(int id,String name, String dep, String comp,double sal)
    {
        eid=id;
        ename=name;
        dept=dep;
        org=comp;
        salary=sal;
    }

    void EmployeeInfo()
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(dept);
        System.out.println(org);
        System.out.println(salary);
        
    }

    public static void main(String[]args) {

        /* 

        System.out.println("*** Example of Non-Parameterised Method ***");

        Employee1 emp=new Employee1();

        emp.eid=101;
        emp.ename="Gautam";
        emp.dept="Development";
        emp.org="Accenture";
        emp.salary=456700.00;

        emp.display();

        System.out.println("*** Example of Parameterised Method ***");

        Employee1 emp1=new Employee1();

        emp1.getEmployeeData(102, "Nitoo", "Testing", "IBM", 554456.00);
        */

        System.out.println("*** Employee Constructor Example ***");

        Employee1 emp2=new Employee1(103, "Purushottam Raj", "Manager", "Microsoft", 787876.00);

        emp2.EmployeeInfo();
    }
    
}
