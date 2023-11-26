package CoreJavaHandsOn;

public class BreakJumpStatement {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 6)// if i==6 it will break the code and will not print further
                break;
            System.out.println(i);
        }
    }
}
