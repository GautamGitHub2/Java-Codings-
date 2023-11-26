package CoreJavaHandsOn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException, IOException {

        FileReader fr = null;
        fr = new FileReader("/Users/gautamkumar/Documents/Gautam_MacBookAir/Hello_Gautam.txt");// In this TXT file i
                                                                                               // have written some
                                                                                               // statement and have
                                                                                               // kept to this location.

        BufferedReader bfr = new BufferedReader(fr);
        System.out.println(bfr.readLine());
        System.out.println(bfr.readLine());// this is for next line of TXT file statement

        Thread.sleep(5000);

        /*
         * Hello Gautam Kumar!
         * Welcome to Core Java Study
         * 
         */

    }

}
