package CoreJavaHandsOn;

public class ExceptionAssignment {

    public static void main(String[] args) {

        System.out.println("Program is Started...");
        System.out.println("Program is in Progress...");

        int a = 10;

        try {
            System.out.println(a / 0);
        } catch (ArithmeticException e0) {
            System.out.println("Entered into catch block of ArithmaticException");
        }

        String s1 = null;

        try {
            System.out.println(s1.length());
        } catch (NullPointerException e1) {
            System.out.println("Entered into catch block of NullPointerException");
        }

        int a1[] = null;
        try {
            System.out.println(a1.length);
        } catch (NullPointerException e2) {
            System.out.println("Entered into catch block of NullPointerException in Array");
        }

        try {
            int a2[] = new int[5];
            System.out.println(a2[10] = 50);
        } catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println("Entered into catch block of ArrayIndexOutOfBoundsException");
        }

        String s = "Gautam";
        try {
            int i = Integer.parseInt(s);
        } catch (NumberFormatException e4) {
            System.out.println("Entered into catch block of NumberFormatException");
        }

        finally {
            System.out.println("Program is completed...");
            System.out.println("Entered into finally block...");
        }

    }

}
