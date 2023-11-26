package CoreJavaHandsOn;

public class ThisKeyword {

    int a,b; // instance variable or class variables 

    void getValues(int a, int b) // parameterised method / method variables/ external variables, we can give same name here as well like class variable
    {
        //a=x; // a=a
        //b=y; //b=b

        this.a=a;
        this.b=b;

        /*
         Syntactically it is correct a=a and b=b but logically it is not correct since it will give a=0 and b=0, because here in method variable , method getValues doesn't know what is a and what is b so it will give 0.
         so to overcome this issue (since it was giving 0) we have to use this keyword like "this.a=a; this.b=b"
         here this keyword will know which variable belongs to class and which one belong to method 
         this keyword always points to class variables
         benefit of this keyword it reduces the number of variables, we should always try to use minimum numbers of variables in the coding/programming  
         */
    }

    void printValues()// default mathod
    {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {

        ThisKeyword th=new ThisKeyword();
        th.getValues(10, 20); // 10 20
        th.printValues();
        
    }
    
}
