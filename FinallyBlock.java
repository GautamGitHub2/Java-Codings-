package CoreJavaHandsOn;

public class FinallyBlock {

    public static void main(String[] args) {
        System.out.println("Program Started...");

        int a = 100;

        try {
            System.out.println(a / 0);

        } catch (ArithmeticException e) {
            System.out.println("Entered into Catch Block...");
        } finally {
            System.out.println("Entered into Finally Block...");
        }
        System.out.println("Program Exited...");

    }

}
