package CoreJavaHandsOn;

class Bike
{
    final void run() // if i keep the 'final' keyword here before the method name then it will give the compile time error 
    { 
        System.out.println("Running...");
    }
}

class Honda extends Bike
{
    void run()
    {
        System.out.println("Running Honda Bike...");//Running Honda Bike...
        super.run(); //Running...
    }

}

public class FinalKeyword1 {

    public static void main(String [] args) {

        Honda hd=new Honda();
        hd.run();//Running Honda Bike...

        /*
        run() in CoreJavaHandsOn.Honda cannot override run() in CoreJavaHandsOn.Bike
        overridden method is final 

        Cannot override the final method from Bike
         
        */
        
    }
    
}
