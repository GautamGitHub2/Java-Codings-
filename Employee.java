package CoreJavaHandsOn;

public class Employee {

    int eid;
    String ename;
    double sal;
    int deptno;
    String job;

    void display() // here if method display() dosen't return anything, we should specify void, if the method is int type then int should be mentioned if nothing is there then void will be used 
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(sal);
        System.out.println(deptno);
        System.out.println(job);
    }
/*
now since i have removed the main class this class cannot be executable, for executing this class we have to go to the main class
*/
    
}
/*
1. main() method can be present in a same class --> we cannot share this class to others
2. main() method can be present in a separate class --> for this we can create separate employee class (EmployeeMain) within the same package that is 'CoreJavaHandsOn' 
*/
