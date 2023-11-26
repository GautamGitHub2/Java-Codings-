package CoreJavaHandsOn;

public class EmployeeMain {
    public static void main(String[] args) // this is the main method so the objects should be created inside the main method only
    {
        Employee emp1=new Employee();

        emp1.eid=101;
        emp1.ename="Gautam";
        emp1.sal=25000.00;
        emp1.deptno=10;
        emp1.job="Developer";

        emp1.display();

        System.out.println("**** 2nd Employee Details ****");

        Employee emp2=new Employee();

        emp2.eid=102;
        emp2.ename="Purushottam";
        emp2.sal=50000.00;
        emp2.deptno=11;
        emp2.job="Manager";

        emp2.display();

    }
}

/*

here Employee and EmployeeMain there are two different class but they are within the same package and Employee object is used within the main class 
 
Output:

101
Gautam
25000.0
10
Developer

**** 2nd Employee Details ****

102
Purushottam
50000.0
11
Manager
 
*/
