package CoreJavaHandsOn;

public class OverloadMainMethod {

    public void main(int x)
    {
        System.out.println(x);
    }
    public void main(int x, int y)
    {
        System.out.println(x+y);
    }
    public void main(int x, int y, int z)
    {
        System.out.println(x+y+z);
    }
    
    public static void main(String[] args) {
        OverloadMainMethod omm=new OverloadMainMethod();
        omm.main(10);//10
        omm.main(20, 40);//60
        omm.main(30, 40, 50);//120
        
    }

    /*
    main mrthod can be on top or below or overloaded main method can be below the main method, order of placing methods in code doesn't matter, JVM always looks for the main method having static keyword and String[] args 
    */
}
