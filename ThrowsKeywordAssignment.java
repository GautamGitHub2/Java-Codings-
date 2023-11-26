package CoreJavaHandsOn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeywordAssignment {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException, IOException {

        FileReader fr = null;
        fr = new FileReader("/Users/gautamkumar/Documents/Gautam_MacBookAir/Hello_Gautam.txt");// In this TXT file i
                                                                                               // have written some
                                                                                               // statement and have
                                                                                               // kept to this location.

        BufferedReader bfr = new BufferedReader(fr);

        while (bfr.readLine() != null) {

            Thread.sleep(3000);// here i have kept 3000 millis because after 3000 millis it will read the
                               // sentences of the TXT file, it will pause for 3000 millis then print nextLine

            System.out.println(bfr.readLine());
        }

        Thread.sleep(1000); // here after 1000 millis the program will be terminated

        /*
         * Hello Gautam Kumar!
         * Welcome to Core Java Study
         * 
         */

    }

}
