package CoreJavaHandsOn;

final class Bike
{
     void run()  
    { 
        System.out.println("Running...");
    }
}

class Honda extends Bike //cannot inherit from final CoreJavaHandsOn.Bike, The type Honda cannot subclass the final class Bike
{
    void run()
    {
        System.out.println("Running Honda Bike...");//Running Honda Bike...
        super.run(); //Running...
    }

}

public class FinalClass {

    public static void main(String [] args) {

        Honda hd=new Honda();
        hd.run();//Running Honda Bike...

        /*
        if i apply final keyword to the parent class bike then we cannot extend this class into child class, it will give compile-time error: //cannot inherit from final CoreJavaHandsOn.Bike, The type Honda cannot subclass the final class Bike  
        */
       
    }
    
}
