package CoreJavaHandsOn;

public class CalculationJavaMethods {

    int x=10;
    int y=20;

    /* 
    void sum() //Case-1 -> Not taking parameters and also not returned any value
    {
        System.out.println(x+y);
    }
    

    int sum() //Case-2 -> Not taking parameters but returning value
    {
        return(x+y);
    }

    void sum(int a, int b) //Case-3 -> Taking parameters, but not returning any value
    {
        System.out.println(a+b);
    }*/

    int sum(int a, int b) //Case-4 -> Method is taking parameters and also returning a value
    {
        return(a+b);
    }


    public static void main(String[] args) {

        CalculationJavaMethods cal=new CalculationJavaMethods(); // Object should always created inside the main method
        
        /* 
        cal.sum();//30 Case-1

        int res=cal.sum();
        System.out.println(res);//30 Case-2
        System.out.println(cal.sum()); // 30 Case-2
      
        cal.sum(100, 200);//300, Case-3
        */

        System.out.println(cal.sum(100, 400));//500 Case-4


        
    }
    
}
