package CoreJavaHandsOn;

public class Calculation { // This is example of parameterized constructor
    int a,b,c;

    Calculation(int x,int y, int z)
    {
        a=x;
        b=y;
        c=z;
    }

    void sum()
    {
        System.out.println(a+b+c);
    }

    public static void main(String[]args) {
        
        Calculation cal=new Calculation(10,20,30);

        cal.sum();//60
        
    }
    
}
