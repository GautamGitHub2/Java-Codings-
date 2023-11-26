package CoreJavaHandsOn;
public class Lab718 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        try {
            String data = args[0];
            int x = Integer.parseInt(data);
            int res = 10 / x;
            System.out.println("result:" + res);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Provide one non zero value");
        }
        System.out.println("Main Completed");

    }

}
