package CoreJavaHandsOn;

public class doWhileLoop {
    public static void main(String[] args) {

        int i = 20;
        // do-while 1st round it will never check the condition, from 2nd round onward
        // it checks the condition

        do {
            System.out.println(i);// 20
            i++;// i=21

        } while (i <= 10);
        {
            System.out.println("Condition failed");// Condition failed
        }

    }

}
