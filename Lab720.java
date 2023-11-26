package CoreJavaHandsOn;
public class Lab720 {
    public static void main(String[] args) {
        System.out.println("Main started");
        try {
            int res = 10 / 0;
            System.out.println("result:" + res);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
            // TODO: handle exception
        } finally {
            System.out.println("Finally Block");
            System.out.println("Main Completed");
        }

    }
}
