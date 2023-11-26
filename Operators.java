package CoreJavaHandsOn;

public class Operators {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("**** Arithmetic Operators  ****");
        

        System.out.println("Sum:"+(a+b));//Sum:30
        System.out.println("Diff:"+(b-a));//Diff:10
        System.out.println("Mul:"+(a*b));//Mul:200
        System.out.println("Div:"+(a/b));//Div:0
        System.out.println("Mod Div:"+(a%b));//Mod Div:10

        System.out.println("**** Relational Operators (Comparision Operators) ****");

        // Relational Operators (Comparision Operators) --> ==, < >, <=, >=, !=
        // Always return boolean value

        System.out.println(a==b);//false
        System.out.println(a>b);//false
        System.out.println(a<b);//true
        System.out.println(a!=b);//true
        System.out.println(a>=b);//false
        System.out.println(a<=b);//true

        System.out.println("**** Logical Opeartors ****");

        //Logical operators && || !

        boolean x=true;
        boolean y=false;

        System.out.println(x && y);//false
        System.out.println(x || y);//true
        System.out.println(!x);//false
        System.out.println(!y);//true

        System.out.println("**** Increment/ Decrement Opeartors ****");

        // Increament / Decrement Operators ++ --

        a=10;
        a++; //a=a+1

        System.out.println(a);

        b=20;
        b--; //b=b-1

        System.out.println(b);

        //Assignment Operators =

        System.out.println("****** Assignment Operator *****");
        String s="Hello";
        String s1="Gautam";
        System.out.println(s+" "+s1);

        System.out.println("***** Addition of two Numbers *****");

        int p=74;
        int q=36;
        int r=p+q;
        System.out.println("Addition of 74 + 36 is: "+ r);

        System.out.println("***** Swap two numbers *****");

        System.out.println("Before swapping:");

        int l=10;
        int m=20;
        int n;

        System.out.println("l:"+l);
        System.out.println("m:"+m);

        System.out.println("After swapping:");

        n=l; //n=10
        l=m; //l=20
        m=n; //m=10

        System.out.println("l:"+l);
        System.out.println("m:"+m);






        


    }
    
}
