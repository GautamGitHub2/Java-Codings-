package CoreJavaHandsOn;
public class Lab722 {
    public static void main(String[] args) {
        System.out.println("Main started");
        try {
            int res = 10 / 0;
            System.out.println("result:" + res);
            return;
        } catch (Exception1 e) {
            System.out.println("Invalid Input");
            // TODO: handle exception
        } finally {
            System.out.println("Finally Block Reached");
            System.out.println("Main Completed");
        }

    }
}
