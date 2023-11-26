package CoreJavaHandsOn;

public class Hello {

    public int show() {
        int a = 0;
        try {
            System.out.println("try block begins:" + a);
            a = 10 / 0;
            System.out.println("try block ends:" + a);
            return a;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            a = 20;
            System.out.println("catch block:" + a);
            return a;
        } finally {
            a = 30;
            System.out.println("finally block:" + a);
            return a;
        }

    }

}
