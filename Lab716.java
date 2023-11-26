package CoreJavaHandsOn;
public class Lab716 {
    public static void main (String[]args)
    {
        System.out.println("Main Started");
        try{
            int res =10/0;
            System.out.println("Result is:"+res);
        }
        catch(NumberFormatException e){
            System.out.println("** Invalid Input");
        }
        System.out.println("Hello Gautam");
        catch (Exception e) {
            System.out.println("Invalid Input");
            // TODO: handle exception
        }
        System.out.println("Main Completed");
    }

}
