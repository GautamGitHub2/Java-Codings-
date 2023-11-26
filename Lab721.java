package CoreJavaHandsOn;
public class Lab721 {
    public static void main(String[] args) {
        System.out.println("Main started");
        try {
            int res = 10 / 3;
            System.out.println("result:" + res);
            return;
        } catch (Exception1 e) {
            System.out.println("Invalid Input");
            // TODO: handle exception
        }
        System.out.println("Main Completed");

    }
}
