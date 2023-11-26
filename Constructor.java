package CoreJavaHandsOn;

public class Constructor {

    int x;
    int y;

    Constructor()//default constructor
    {
        x=10;
        y=20;
    }
    Constructor(int a, int b)//parameterised constructor
    {
        x=a;
        y=b;
    }
    void display()
    {
        System.out.println(x+y);
    }
    public static void main(String[]args) {
        Constructor con=new Constructor();// invokes default constructor
        con.display();//30

        Constructor con1=new Constructor(100,500);// invokes parameterised constructor
        con1.display();//600


        
    }
    
}
