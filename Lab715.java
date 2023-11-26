package CoreJavaHandsOn;
public class Lab715 {
    public static void main (String[]args)
    {
        System.out.println("Main Started");
        try{
            int res =10/0;
            System.out.println("Result is:"+res);
        }System.out.println("Hello Gautam");
        catch(NumberFormatException e){
            System.out.println("** Invalid Input");
        }
        System.out.println("Main End");
    }

}
