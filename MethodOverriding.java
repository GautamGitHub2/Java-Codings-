package CoreJavaHandsOn;

    class bank // base class
    {
        double rateOfInterest()
        {
            return 0;
        }

    }

    class SBI extends bank 
    {
        double rateOfInterest()
        {
            return 10.5;
        }

    }

    class ICICI extends bank
    {
        double rateOfInterest()
        {
            return 9.7;
        }

    }

    class AXIS extends bank
    {
        double rateOfInterest()
        {
            return 8.7;
        }

    }

    class PNB extends bank
    {
        double rateOfInterest()
        {
            return 7.7;
        }

    }

    class IDBI extends bank
    {
        double rateOfInterest()
        {
            return 6.7;
        }

    }

    public class MethodOverriding {

    public static void main(String[] args) {

        SBI sbi=new SBI();
        System.out.println(sbi.rateOfInterest()); //10.5

        ICICI icici=new ICICI();
        System.out.println(icici.rateOfInterest()); // 9.7

        AXIS axis=new AXIS();
        System.out.println(axis.rateOfInterest()); // 8.7

        PNB pnb=new PNB();
        System.out.println(pnb.rateOfInterest()); //7.7

        IDBI idbi=new IDBI();
        System.out.println(idbi.rateOfInterest()); //6.7


        /*
        
        Important points

        Method Overriding
        -------------------
        Re-write the methods in child classes.
        
        1. Method definition should be same
        2. Body should be changed


        */


    }
    
}
