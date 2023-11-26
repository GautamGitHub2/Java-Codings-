package CoreJavaHandsOn;

public class CheckedException {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program is started...");
        System.out.println("Program is in progress...");

        // here in below statement i would like to pause the code execution for few
        // seconds / mili second then i want to excute the rest of the below statement

        // Handle checked exception by try_catch block

        /*
         * try {
         * Thread.sleep(5000);
         * } catch (InterruptedException e) {
         * // TODO Auto-generated catch block
         * e.printStackTrace();
         * }
         */

        // Handle checked exception by throws keyword, add this keyword to the PSVM with
        // the exception name "InterruptedException" then run the program, it will
        // execute smoothly as it was coded
        Thread.sleep(5000);

        // Unhandled exception type InterruptedException, here this error is coming and
        // this is Unhandled exception (Checked) and this one can be handelled by throws
        // keyword or try-catch block

        System.out.println("Program is completed...");
        System.out.println("Program is exited...");

        // Output: here 1st it will execute 2 statements at a time and wait for 5
        // seconds and then it will execute rest 2 statements

        /*
         * Program is started...
         * Program is in progress...
         * Program is completed...
         * Program is exited...
         */

    }

}
