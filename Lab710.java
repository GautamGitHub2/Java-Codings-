package CoreJavaHandsOn;
public class Lab710 {
    public static void main(String[] args) 
    {
        System.out.println("Main Started");
        try{
            String data=args[0];
            int x=Integer.parseInt(data);
            int res=10/x;
            System.out.println("Result:"+res);
        }catch(Exception1 e){
            System.out.println("Enter Correct Value");
        }
        System.out.println("Main Completed");
        
    }
    
}
