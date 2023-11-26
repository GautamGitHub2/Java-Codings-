package CoreJavaHandsOn;

public class Student1 {

    int sid;
    String sname;
    int sub1,sub2,sub3;

    void getStuData(int sid, String sname)
    {
        System.out.println(sid+" "+sname);
    }

    void getStuMarks(int sub1, int sub2, int sub3)
    {
        System.out.println("Sub1:"+sub1);
        System.out.println("Sub2:"+sub2);
        System.out.println("Sub3:"+sub3);
    }

    int totalMarks(int sub1, int sub2, int sub3)
    {
        return(sub1+sub2+sub3);
    }

    public static void main(String[]args) {

        Student1 st=new Student1();
        st.getStuData(101, "Gautam");

        st.getStuMarks(75, 85, 95);

        System.out.println("Total Marks of Student:"+st.totalMarks(75, 85, 95));

        /*
         Complete Output is:
         101 Gautam
         Sub1:75
         Sub2:85
         Sub3:95
         Total Marks of Student:255
        */
        
    }
    
}
