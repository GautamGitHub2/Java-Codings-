package CoreJavaHandsOn;

public class ContinueJumpStatement {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i == 12)// if i==12 then it will skip i=12 and continue from 13,14...20
                continue;

            System.out.println(i);
        }

    }

}
