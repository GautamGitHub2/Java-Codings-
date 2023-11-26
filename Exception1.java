package CoreJavaHandsOn;

public class Exception1 {

  public static void main(String[] args) {

    System.out.println("Program is started..."); // this one will execute
    System.out.println("Program is in progress..."); // this one will also execute

    int a = 100;
    // int res = 0;

    try {
      // System.out.println(a/2); // here error will come. Exception in thread "main"
      // java.lang.ArithmeticException: / by zero
      System.out.println(a / 0);
    } catch (ArithmeticException e) {
      System.out.println("Entered into Catch Block of ArithmeticException");
    }
    // System.out.println(res);// 0

    String s = null;
    try {
      System.out.println(s.length());// Exception in thread "main" java.lang.NullPointerException
    } catch (NullPointerException e1) {
      System.out.println("Entered into Catch block of NullPointerException");
    }
    String x = "abc";
    try {
      int i = Integer.parseInt(x); // For input string: "abc" at java.base/java.lang.NumberFormatException
    } catch (NumberFormatException e2) {
      System.out.println("Entered into Catch block of NumberFormatException");
    }

    try {
      int arr[] = new int[5];
      arr[10] = 100;

    } catch (ArrayIndexOutOfBoundsException e3) {
      System.out.println("Entered into catch block of ArrayIndexOutOfBoundsException");
    }
    System.out.println("Program is completed..."); // this one will NOT execute, compiler didn't reach here
    System.out.println("Program is exited..."); // this one will also NOT execute, compiler didn't reach here

    /*
     * Important points for try-catch block
     * 
     * 1. one try block can have multiple catch block but at a time only one catch
     * block will execute, the compiler check one by one which exception is matching
     * and when it matches it will throw that exception.
     * 
     * try
     * {
     * Statements;
     * }
     * catch(Exception e) // generic exception/ all types of exception will be
     * catched here,if matching exception is not mentioned then it will catch from
     * here.
     * {
     * Statements;
     * }
     * catch(ArithmeticException Type)
     * {
     * Statements;
     * }
     * catch(NullPointerException Type)
     * {
     * Statements;
     * }
     * catch(NumberFormatException Type)
     * {
     * Statements;
     * }
     * catch(ArrayIndexOutOfBoundsException Type)
     * {
     * Statements;
     * }
     * 
     * Syntax 2
     * ----------
     * try
     * {
     * statements;
     * }
     * catch(Exception 1)
     * {
     * statements;
     * }
     * catch(Exception 2)
     * .
     * .
     * .
     * 
     * Syntax 3
     * ---------
     * try
     * {
     * to open a file
     * }
     * catch(Exception Type)
     * {
     * ----
     * }
     * finally --> this one will always execute id try and catch is not executed
     * {
     * close [if file is not present then it will execute finally and close the
     * code]
     * }
     * 
     * 
     * 
     * 
     * 
     * 
     */

  }

}
