package CoreJavaHandsOn;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            System.out.println(i); // it will print the infinite numbers and explicitly i have to stop that loop
                                   // else it will go on

            // so to stop the infinit loop i have to put the condition just after the sysout

            i += 2; // this is condition to stop the infinite results/ output of the while loop
        }

    }

}
