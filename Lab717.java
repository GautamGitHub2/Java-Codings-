package CoreJavaHandsOn;
public class Lab717 {
    public static void main(String args[]) {
        System.out.println("Main Started");
        String data = null;

        try {
            data = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Provide one value as Gautam");
        }
        int x = 0;
        try {
            x = Integer.parseInt(data);
        } catch (NumberFormatException e) {
            System.out.println("Provide int value");
        }
        try {
            int res = 10 / x;
            System.out.println("result:" + res);
        } catch (ArithmeticException e) {
            System.out.println("provide non zero int value");
        }
        System.out.println("Main Completed");

    }

}
